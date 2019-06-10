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

<title>问卷系统用户注册</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
* {
	padding: 0;
	margin: 0;
}

body {
	background: url("images/bg.jpg") no-repeat;
	background-size: 100%;
}

.main {
	width: 400px;
	height: 500px;
	position: absolute;
	left: 50%;
	top: 50%;
	margin-left: -200px;
	margin-top: -225px;
	background-color: rgba(255, 255, 255, 0.8);
}

.top {
	font-size: 40px;
	color: grey;
	height: 120px;
	line-height: 120px;
	text-align: center;
}

.content {
	position: absolute;
	top: 120px;
	width: 100%;
	height: 380px;
	background-color: white;
}

.content ul {
	list-style: none;
}

.info {
	position: absolute;
	margin: 40px 50px;
	text-align: center;
}

.content li {
	border-radius: 40px;
	border: 1px solid cornflowerblue;
	width: 300px;
	margin-bottom: 20px;
	line-height: 35px;
}

.content img {
	height: 27px;
	width: 27px;
	vertical-align: middle;
}

.content input {
	height: 30px;
	border: none;
	width: 70%;
	background-color: transparent;
	outline: none;
}

input:-webkit-autofill {
	-webkit-box-shadow: 0 0 0 1000px white inset;
}

.judge {
	width: 20px;
	height: 20px;
	visibility: hidden;
}

.submit {
	width: 190px;
	height: 40px;
	background-color: #95B8E7;
	border: 1px solid white;
	cursor: pointer;
}
</style>
</head>

<body>
	<div class="main">
		<div class="top">Register</div>
		<div class="content">
			<div class="info">
				<form action="${pageContext.request.contextPath }/regist/register" method="post">
					<ul>
						<li><img src="images/user.png" /> <input type="text"
							placeholder="请输入用户名(8-15位)" name="uName" id="uName" value="${user.uName }"/> <img
							src="images/true.png" class="judge" name="judge"></li>
						<li><img src="images/password.png" /> <input type="password"
							placeholder="8~15位字母、数字或符号" name="uPwd" id="uPwd" value="${user.uPwd }"/> <img
							src="images/true.png" class="judge" name="judge"></li>
						<li><img src="images/password.png" /> <input type="password"
							placeholder="确认密码" name="repass" id="repass" value="${user.uPwd }"/> <img
							src="images/true.png" class="judge" name="judge"></li>
						<li><img src="images/phone.png" /> <input type="number"
							placeholder="请输入手机号码" name="uPhone" id="uPhone" value="${user.uPhone }"/> <img
							src="images/true.png" class="judge" name="judge"></li>
						<li><img src="images/email.png" /> <input type="email"
							placeholder="请输入邮箱" name="uMail" id="uMail" value="${user.uMail }"/> <img
							src="images/true.png" class="judge" name="judge"></li>
					</ul>
					<button type="submit" class="submit">立即注册</button>
				</form>
			</div>
		</div>
	</div>
</body>
<script src="common/jquery-3.3.1.js"></script>
<script>

	function checked() {
		var username = document.getElementById("uName");
		var password = document.getElementById("uPwd");
		var rePassword = document.getElementById("repass");
		var phone = document.getElementById("uPhone");
		var email = document.getElementById("uMail");
		var judge = document.getElementsByName("judge");
		/* $.ajax({
		     url : "ques/list",
		     type : "post",
		     dataType : "json",
		     data : {
		         "uid" : $("#uid").val(),
		     },
		     success : function(data) {
		         var name=data;
		     },
		     error : function() {
		         alert("请求失败");
		     }
		 });*/
		 username.onfocus = function() {
			judge[0].style.visibility = "hidden";
			var stat = null;
		};
		username.onblur = function() {
			// 检查用户名是否可用
			/* $.ajax({
				url : "register/exist",
				success : function(data) {
					$('#uName').attr("value", data)
				}
			}); */
			if (username.value.length >= 3 && username.value.length <= 20 && username.value.match(/^\S+$/)) {
				stat = true;
			} else {
				stat = false;
			}
			judge[0].style.visibility = "visible";
			judge[0].src = "images/" + stat + ".png";
		};
		password.onfocus = function() {
			judge[1].style.visibility = "hidden";
			var stat = null;
		};
		password.onblur = function() {
			if (password.value.length >= 8 && password.value.length <= 15 && password.value.match(/^\S+$/)) {
				stat = true;
			} else {
				stat = false;
			}
			judge[1].style.visibility = "visible";
			judge[1].src = "images/" + stat + ".png";
		};
		rePassword.onfocus = function() {
			judge[2].style.visibility = "hidden";
			var stat = null;
		};
		rePassword.onblur = function() {
			if (rePassword.value.length >= 8 && rePassword.value.length <= 15 && rePassword.value.match(/^\S+$/) && rePassword.value == password.value) {
				stat = true;
			} else {
				stat = false;
			}
			judge[2].style.visibility = "visible";
			judge[2].src = "images/" + stat + ".png";
		};
		phone.onfocus = function() {
			judge[3].style.visibility = "hidden";
			var stat = null;
		};
		phone.onblur = function() {
			if (phone.value.length == 11) {
				stat = true;
			} else {
				stat = false;
			}
			judge[3].style.visibility = "visible";
			judge[3].src = "images/" + stat + ".png";
		};
		email.onfocus = function() {
			judge[4].style.visibility = "hidden";
			var stat = null;
		};
		email.onblur = function() {
			if (email.value.match(/\w+@\w+\.\w/)) {
				stat = true;
			} else {
				stat = false;
			}
			judge[4].style.visibility = "visible";
			judge[4].src = "images/" + stat + ".png";
		};
	}
	checked(); 
</script>
</html>
