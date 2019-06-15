//请求数据
$(document).ready(function() {
	$.ajax({
		// 此处响应问卷数据
		url : "ques/list",
		type : "post",
		dataType : "json",
		data : {
			"uid" : $("#uid").val(),
			"currentPage" : $("#currentPage").val()
		},
		success : function(data) {
			showData(data);
		},
		error : function() {
			alert("请求失败");
		}
	});
});

//显示数据
function showData(data) {
	var table = document.querySelector(".list");
	var tbody = document.createElement("tbody");
	tbody.innerHTML = "";
	tbody.style.backgroundColor = "white";
	for (var i = 0; i < data.pageSize; i++) {
		var state = "<i class='red'></i>" + "已结束";
		if (data.recordList[i].qState == true) {
			state = "<i class='green'></i>" + "收集中";
		}
		var sharelink = data.recordList[i].qId;
		var stateValue = data.recordList[i].qState;
		tbody.innerHTML += "<tr><td><div class='edit' name='qName' qid=" + sharelink + ">" + data.recordList[i].qName +
			"</div></td><td><div class='curr-state' value=" + stateValue + ">" + state +
			"</div></td><td><div name='qCreatedate'>" + data.recordList[i].qCreatedate +
			"</div></td><td><div class='edit' name='qCount' qid=" + sharelink + ">" + data.recordList[i].qCount +
			"</div></td><td><div class='edit' name='qRemark' qid=" + sharelink + ">" + data.recordList[i].qRemark +
			"</div></td><td>" + "<a href='javascript:;' onclick='sharefun(\"" + sharelink + "\")'>分享</a> " +
			"| <a href='javascript:;' onclick='tongjifun()'>统计</a> " +
			"| <a href='javascript:;' onclick='deleteForm(this)' class='more'>删除</a>" +
			"</td></tr>";
		table.appendChild(tbody);
	}
	table.style.width = 79 + "%";
	table.style.marginLeft = "-39%";

	//对齐
	var addList = document.querySelector(".add-list");
	var table = document.querySelector(".list");
	addList.style.marginLeft = table.offsetLeft + "px";
	var pageContext = $("#PageContext").val();
	addList.onclick = function() {
		window.location.href = pageContext + "/ques/toAddPage";
	};

	var ableEdit = document.getElementsByClassName("edit");
	for (var n = 0; n < ableEdit.length; n++) {
		effect(ableEdit[n]);
	}

	function effect(obj) {
		var htmlold = obj.innerHTML;
		obj.onclick = function() {
			this.setAttribute("contenteditable", "true");
		};
		obj.onfocus = function() {
			this.style.backgroundColor = "#eeeeee";
			this.style.outline = "none";
			this.style.textOverflow = "";

		};
		obj.onblur = function() {
			var htmlnew = obj.innerHTML;
			this.style.backgroundColor = "transparent";
			this.style.textOverflow = "ellipsis";
			if (htmlold != htmlnew) {
				var postname = $(this).attr("name");
				var qid = $(this).attr("qid");
				var value = $(this).html();
				if (confirm("确定要修改吗")) {
					/*$.post("", {
					     postname :$(this).html()
					     });*/
					$.ajax({
						// 此处响应问卷数据
						url : "ques/update",
						type : "post",
						dataType : "json",
						data : {
							"qid" : qid,
							"type" : postname,
							"value" : value,
						},
						postname : value
					});

				}
			}
		}
	}

	$(".curr-state").mouseenter(function() {
		var sign = this.getElementsByTagName("i");
		var num = $(".curr-state").index(this);
		var that = this;
		//this.style.cursor="pointer";
		if (data.recordList[num].qState == true) {
			sign[0].innerHTML = "";
			sign[0].onclick = function() {
				if (confirm("确认结束吗？")) {
					sign[0].innerHTML = "";
					that.innerHTML = "<i class='red'></i>" + "已结束";
					$sta = data.recordList[num].qState;
					var qid = data.recordList[num].qId;
					/*alert($sta);
					alert(qid);*/
					$.ajax({
						// 此处响应问卷数据
						url : "questionnaire/closeOropen",
						type : "post",
						dataType : "json",
						data : {
							"qid" : qid,
							"state" : $sta
						},
						success : function(data) {
							if (data.msg == "true") {
								$sta:1
							} else
								$sta:0
						}
					});
				}
			}
		} else {
			sign[0].innerHTML = "";
			sign[0].onclick = function() {
				if (confirm("确认重新开始吗？")) {
					sign[0].innerHTML = "";
					that.innerHTML = "<i class='green'></i>" + "收集中";
					$sta = data.recordList[num].qState;
					var qid = data.recordList[num].qId;
					/*alert($sta);
					alert(qid);*/
					$.ajax({
						// 此处响应问卷数据
						url : "questionnaire/closeOropen",
						type : "post",
						dataType : "json",
						data : {
							"qid" : qid,
							"state" : $sta
						},
						success : function(data) {
							if (data.msg == "true") {
								$sta:1
							} else
								$sta:0
						}
					});
				}
			}
		}
	});
	$(".curr-state").mouseout(function() {
		var sign = this.getElementsByTagName("i");
		sign[0].innerHTML = "";
	});

}
//退出登录显示与隐藏
function addLi(num, remarks, parent, nameId) {
	for (var i = 0; i < num; i++) {
		var li = document.createElement("li");
		li.innerHTML = remarks[i];
		li.id = nameId[i];
		parent.appendChild(li);
	}
}
(function() {
	var ul = document.createElement("ul");
	var li = document.getElementById("user");
	var info = document.getElementById("info");
	addLi(2, [ "个人信息", "退出登录" ], ul, [ "personal", "quit" ]);
	ul.className = "menu";
	li.appendChild(ul);
	info.onmouseover = function() {
		ul.style.display = "inline";
	};
	info.onmouseout = function() {
		ul.style.display = "none";
	};
}());

//导航栏固定
window.onscroll = function() {
	var nav = document.getElementById("nav");
	var scrollTop = document.documentElement.scrollTop;
	if (scrollTop > 0) {
		nav.style.position = "fixed";
		nav.style.top = 0 + "px";
		nav.style.zIndex = "100";
	} else {
		nav.style.position = "static";
	}
};
// 分享按钮
function sharefun(data) {
	var domain = window.location.host;
	/*alert(domain);*/
	var url = "http://" + domain + "/ques-sys/questionnaire/make?qid=" + data;
	alert("分享链接为：" + url);
}
//统计
function tongjifun(data) {
	alert("开发中...");
}
//删除
function deleteForm(obj) {
	/*
	var tbody=document.getElementsByTagName("tbody");
	tbody[0].removeChild(obj.parentNode.parentNode);
	*/
	if (confirm('确实要删除该内容吗？可能触发级联删除！')) {
		$.ajax({
			url : "ques/delete",
			data : "qid=" + obj,
			success : function(data) {
				if (data.msg == "true") {
					alert("删除成功！");
					var tbody = document.getElementsByTagName("tbody");
					tbody[0].removeChild(obj.parentNode.parentNode);
				} else {
					alert("删除失败！");
				}
			}
		});
	}
}
//页码
/*
function numPages() {

}*/
//退出登录
$("#quit").click(function() {
	var flag = confirm("确定要退出登录吗？");
	if (flag == true) {
		window.location.href = "login/exit";
	}
});

// 个人信息
$("#personal").click(function() {
	alert("开发ing");
// window.location.href="login/exit";
});