<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>密码找回</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="css/main.css">
<style type="text/css">
.top {
	height: 80px;
	line-height: 80px;
}

.content {
	top: 80px;
}

.top li {
	display: inline;
	font-size: 26px;
	width: 200px;
	float: left;
}

.top li:first-child {
	background-color: white;
}

.send {
	width: 78px;
	height: 28px;
	background-color: lightgrey;
}

#wid {
	width: 53%;
}
</style>
</head>

<body>
	<div class="main">
		<div class="top">
			<ul>
				<li id="phone-back">手机验证</li>
				<li id="email-back">邮箱验证</li>
			</ul>
		</div>
		<div class="content">
			<div class="info">
				<form action="" method="post">
					<ul>
						<li id="approach"><img src="images/phone.png" id="icon" /></li>
						<li><img src="images/check.png" /> <input type="number"
							placeholder="请输入验证码" id="wid" /> <span><button
									type="button" class="send" onclick="send();">发送验证码</button></span></li>
						<li><img src="images/password.png" /> <input type="password"
							placeholder="6~20位字母、数字或符号" name="password" id="password" /></li>
						<li><img src="images/password.png" /> <input type="password"
							placeholder="确认密码" name="repass" id="repass" /> <img
							src="images/true.png" name="judge" class="judge"></li>
					</ul>
					<button type="submit" class="submit" onclick="submit()">立即注册</button>
				</form>
			</div>
		</div>
	</div>
</body>
<script>
	(function() {
		var phoneBack = document.getElementById("phone-back");
		var emailBack = document.getElementById("email-back");
		var icon = document.getElementById("icon");
		var approach = document.getElementById("approach");
		var input = document.createElement("input");
		input.type = "number";
		input.placeholder = "请输入手机号码";
		input.name = "phone";
		approach.appendChild(input);
		function option(obj, other, photo, kind, info, id) {
			obj.onmouseover = function() {
				obj.style.backgroundColor = "white";
				other.style.backgroundColor = "transparent";
				icon.src = "images/" + photo + ".png";
				input.type = kind;
				input.placeholder = info;
				input.name = id;
				input.id = id;
			};
		}
		option(emailBack, phoneBack, "email", "email", "请输入邮箱", "email");
		option(phoneBack, emailBack, "phone", "number", "请输入手机号码", "phone");
	}());

	function send() {
		time($(".send"));
		var phone = $.trim($("#phone").val());
		var mail = $.trim($("#email").val());
		if ((phone == null || phone == "") && (mail == null || mail == "")) {
			alert("邮箱或手机号码不能为空");
			return false;
		}
		$.ajax({
			url : "ques/sendMsg",
			dataType : "json",
			data : {
				"email" : $("#email").val(),
				"phone" : $("#phone").val()
			}
		});
	}
	var wait = 60;
	function time(o) {
		if (wait == 0) {
			o.removeAttr("disabled");
			o.text("发送验证码");
			wait = 60;
		} else {
			o.attr("disabled", true);
			o.text(wait + "s后重发");
			wait--;
			setTimeout(function() {
				time(o)
			}, 1000)
		}
	}
	
	function submit(){
		var phone = $.trim($("#phone").val());
		var mail = $.trim($("#email").val());
		if ((phone == null || phone == "") && (mail == null || mail == "")) {
			alert("邮箱或手机号码不能为空");
			return false;
		}
		var password = $.trim($("#password").val());
		var repass = $.trim($("#repass").val());
		if ((password == null || password == "") && (repass == null || repass == "")) {
			alert("密码不能为空");
			return false;
		}
		if (password != repass){
			alert("两次密码不一致");
			return false;
		}
		$.ajax({
			url : "ques/sendMsg",
			dataType : "json",
			data : {
				"email" : $("#email").val(),
				"phone" : $("#phone").val()
			},
			success : function(data){
				
			}
		});
	}
</script>
<script src="common/jquery-3.3.1.js"></script>
</html>
