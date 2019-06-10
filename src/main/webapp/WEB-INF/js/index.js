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
	//数据更改
	$("#data").change(function() {
		$.ajax({
			type : "post",
			url : "",
			data : $("#data").serialize(),
			success : function() {
				alert("修改成功！");
			},
			error : function() {
				alert("修改失败！");
			}
		})
	});
});
//对齐
var addList = document.querySelector(".add-list");
var table = document.querySelector(".list");
addList.style.marginLeft = table.offsetLeft + "px";
var pageContext = $("#PageContext").val();
addList.onclick = function() {
	window.location.href = pageContext + "/ques/toAddPage";
};
//显示数据
function showData(data) {
	var tbody = document.createElement("tbody");
	// var table=document.querySelector(".list");
	tbody.innerHTML = "";
	tbody.style.backgroundColor = "white";
	for (var i = 0; i < data.pageSize; i++) {
		var state = "<i class='red'></i>" + "已结束";
		if (data.recordList[i].qState == true) {
			state = "<i class='green'></i>" + "收集中";
		}
		var sharelink = data.recordList[i].qId;
		var qid = sharelink;
		tbody.innerHTML += "<tr><td><div class='edit' name='qName'>" + data.recordList[i].qName +
			"</div></td><td><div class='curr-state'>" + state +
			"</div></td><td><div class='edit' name='qCreatedate'>" + data.recordList[i].qCreatedate +
			"</div></td><td><div class='edit' name='qCount'>" + data.recordList[i].qCount +
			"</div></td><td><div class='edit' name='qRemark'>" + data.recordList[i].qRemark +
			"</div></td><td>" + "<a onclick='sharefun(\"" + sharelink + "\")'>分享</a> " +
			"| <a href='javascript:;' onclick='tongjifun()'>统计</a> " +
			"| <a href='javascript:;' onclick='deleteForm(\"" + qid + "\")' class='more'>删除</a>" +
			"</td></tr>";
		table.appendChild(tbody);
	}
	var ableEdit = document.getElementsByClassName("edit");
	for (var n = 0; n < ableEdit.length; n++) {
		ableEdit[n].style.width = ableEdit[n].parentNode.offsetWidth + "px";
		effect(ableEdit[n]);
	}
	function effect(obj) {
		obj.onclick = function() {
			this.setAttribute("contenteditable", "true");
		};
		obj.onfocus = function() {
			this.style.backgroundColor = "#eeeeee";
			this.style.outline = "none";
			this.style.textOverflow = "";
		};
		obj.onblur = function() {
			this.style.backgroundColor = "transparent";
			this.style.textOverflow = "ellipsis";
		/*var range=obj.createTextRange();
		range.moveStart("character",1);
		range.collapse();
		range.select();*/
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
				sign[0].innerHTML = "";
				that.innerHTML = "<i class='red'></i>" + "已结束";
				data.recordList[num].qState = 0;
			}
		} else {
			sign[0].innerHTML = "";
			sign[0].onclick = function() {
				sign[0].innerHTML = "";
				that.innerHTML = "<i class='green'></i>" + "收集中";
				data.recordList[num].qState = 1;
			}
		}
	});
	$(".curr-state").mouseout(function() {
		var sign = this.getElementsByTagName("i");
		sign[0].innerHTML = "";
	});

}
//退出登录的显示隐藏
function addLi(num, remarks, parent) {
	for (var i = 0; i < num; i++) {
		var li = document.createElement("li");
		li.innerHTML = remarks[i];
		parent.appendChild(li);
	}
}
(function() {
	var ul = document.createElement("ul");
	var user = document.getElementById("user");
	var info = document.getElementById("info");
	addLi(1, [ "退出登录" ], ul);
	ul.className = "menu";
	user.appendChild(ul);
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
				alert(data.msg);
			}
		});
	}
}
//页码
/*
function numPages() {

}*/