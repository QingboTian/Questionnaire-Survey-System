var count = 0;
var num = 0;
//单选多选列表
function addLi(num, remarks, parent) {
	for (var i = 0; i < num; i++) {
		var li = document.createElement("li");
		li.innerHTML = remarks[i];
		parent.appendChild(li);
	}
}
(function() {
	var ul = document.createElement("ul");
	var add = document.getElementById("add");
	addLi(2, [ "单选", "多选" ], ul);
	ul.className = "selected";
	ul.id = "selected";
	add.appendChild(ul);
	add.onmouseover = function() {
		ul.style.display = "inline";
	};
	add.onmouseout = function() {
		ul.style.display = "none";
	};
}());
//点击单选多选
(function clickSingle() {
	var selected = document.getElementById("selected");
	var li = selected.getElementsByTagName("li");
	var add = document.getElementById("add");
	li[0].onclick = function() {
		addSingle("");
	};
	li[1].onclick = function() {
		addSingle("");
	};
}());
//创建一个问答，插入add之前
function addSingle(ico) {
	num = 1;
	var piece = document.createElement("div");
	piece.className = "piece";
	piece.innerHTML = '<div class="content">' +
	'<span class="num"></span><div data-ph="请输入问题" class="edit title_area" name="contentList['+count+'].cTitle"></div>' +
	'<div class="handle">' +
	'<a href="javascript:;" class="increase" onclick=\'clickEvent(this)\'></a>' +
	'<a href="javascript:;" class="delete" onclick=\'deletePiece(this)\'></a></div>' +
	'<ul><li><div class="li_area"><i>' + ico + '</i>' +
	'<div class="edit" data-ph="选项一" name="answerList['+count+'].answer[0].caAnswer"></div></div>' +
	'</li>' +
	'<li><div class="li_area"><i>' + ico + '</i>' +
	'<div class="edit" data-ph="选项二"  name="answerList['+count+'].answer[1].caAnswer"></div></div>' +
	'</li>' +
	'</ul>' +
	'</div>';
	count++;
	var selected = document.getElementById("selected");
	var li = selected.getElementsByTagName("li");
	var question = document.getElementById("questionnaire");
	var add = document.getElementById("add");
	question.insertBefore(piece, add);
	question.style.border = "none";
	editText();
}
//点击添加按钮
function clickEvent(obj) {
	num++;
	var increase = document.getElementsByClassName("increase");
	var content = obj.parentNode.parentNode;
	var lis = content.getElementsByTagName("li");
	var ico = content.getElementsByTagName("i");
	var ul = content.getElementsByTagName("ul");
	var li = document.createElement("li");
	var i = document.createElement("i");
	var div = document.createElement("div");
	var area = document.createElement("div");
	area.className = "li_area";
	i.innerHTML = ico[0].innerHTML;
	div.className = "edit";

	div.setAttribute("name", "answerList[" + (count - 1) + "].answer[" + num + "].caAnswer");
	div.setAttribute("data-ph","选项" + toChinese(lis.length + 1));
	div.innerHTML = "选项" + toChinese(lis.length + 1);
	area.appendChild(i);
	area.appendChild(div);
	li.appendChild(area);
	if (lis.length < 5) {
		ul[0].appendChild(li);
	}
	editText();
}
//点击删除按钮
function deletePiece(obj) {
	var piece = obj.parentNode.parentNode.parentNode;
	var exist = document.getElementsByClassName("piece");
	var question = document.getElementById("questionnaire");
	question.removeChild(piece);
	if (exist.length <= 0) {
		question.style.border = "darkgray 1px dashed";
	}
}
//阿拉伯数字变为汉字
function toChinese(num) {
	var chinese = [ "一", "二", "三", "四", "五" ];
	var result;
	if (num > 5) {
		alert("不好意思 ，选项最多5项");
	}
	result = chinese[num - 1];
	return result;
}
//设置点击编辑
function editText() {
	var question = document.getElementById("questionnaire");
	var edit = document.getElementsByClassName("edit");
	var title = question.getElementsByClassName("title_area");
	var option = question.getElementsByClassName("li_area");
	var lis = question.getElementsByTagName("li");
	/*var bottom=document.querySelector(".bottom_area");
	bottom.style.width="500px";
	bottom.style.lineHeight="30px";
	bottom.style.textAlign="center";
	bottom.style.position="absolute";
	bottom.style.top="50%";
	bottom.style.left="50%";
	bottom.style.marginLeft="-250px";
	bottom.style.marginTop="-"+bottom.offsetHeight/2+"px";*/
	for (var i = 0; i < title.length; i++) {
		title[i].style.lineHeight = "36px";
		title[i].style.width = "300px";
		effect(title[i]);
	}
	for (var j = 0; j < option.length; j++) {
		effect(option[j]);
		option[j].style.lineHeight = "32px";
		option[j].style.width = "300px";
		var f = option[j].getElementsByClassName("edit")[0];
		f.style.width = "263px";
	}
	for (var x = 0; x < edit.length; x++) {
		edit[x].setAttribute("contenteditable", "true");
		edit[x].onfocus = function() {
			this.style.outline = "none";
		}
	}
}
function effect(obj) {
	obj.onmouseover = function() {
		this.style.border = "darkgray 1px dashed";
	};
	obj.onmouseout = function() {
		this.style.border = "white 1px dashed";
	};
	obj.onfocus = function() {
		this.style.backgroundColor = "#eeeeee";
		this.style.border = "white 1px dashed";
	};
	obj.onblur = function() {
		this.style.backgroundColor = "transparent";
	}
}

$(".submit").click(function() {
	var obj = {};
	$("input").each(function() {
		key = $(this).attr("name");
		value = $(this).val();
		obj[key] = value;
	});
	$(".edit").each(function() {
		key = $(this).attr("name");
		value = $(this).html();
		obj[key] = value;
	});

	$.ajax({
		url : "questionnaire/add",
		type : "post",
		/*dataType : "json",*/
		data : obj,
		success : function(data) {
			if (data.msg == "success"){
				window.location.href = "ques/index";
			}else{
				alert("问卷创建失败，请仔细检查问卷是否添加完整！");
			}
		},
		error : function() {
			alert("请求失败");
		}
	});
});
editText() ;