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

<title>问卷系统登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
body {
	padding: 0;
	margin: 0;
}

body {
	background: url("images/bg.jpg") no-repeat;
	background-size: 100%;
}

.login {
	width: 400px;
	height: 450px;
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
	height: 330px;
	background-color: rgba(255, 255, 255, 0.9);
}

.info {
	position: absolute;
	margin: 50px;
	text-align: center;
}

.list {
	border-radius: 40px;
	border: 1px solid cornflowerblue;
	width: 290px;
	margin-bottom: 30px;
	line-height: 40px;
}

.list img {
	height: 30px;
	width: 30px;
	vertical-align: middle;
}

.list input {
	height: 30px;
	border: none;
	width: 80%;
	background-color: transparent;
}

.submit {
	width: 190px;
	height: 40px;
	background-color: #95B8E7;
	border: 1px solid white;
	margin-top: 30px;
	cursor: pointer;
}

.prompt{
    color: cornflowerblue;
    font-size: 14px;
    text-align: right;
}

.error {
	color: red;
}
</style>

</head>

<body>
	<div class="login">
		<div class="top">Login</div>
		<div class="content">
			<form action="${pageContext.request.contextPath }/login" method="post">
				<div class="info">
					<div class="list">
						<img src="images/user.png" /> <input type="text" name="username"
							value="${username }" placeholder="请输入用户名" id="username" va />
					</div>
					<div class="list">
						<img src="images/password.png" /> <input type="password"
							name="password" value="${password }" placeholder="请输入密码"
							id="password" />
					</div>
					<!--<div class="list">
                        <img  src="../images/check.png"/>
                        <input  type="text" placeholder="请输入验证码"/>
                    </div>-->
					<div class="prompt"><a href="${pageContext.request.contextPath }/forget">忘记密码？</a><a href="${pageContext.request.contextPath }/register">注册账号</a></div>
					<div class="error">${error }</div>
					<button type="submit" class="submit">登录</button>
				</div>
			</form>
		</div>


	</div>
</body>

<script src="common/jquery-3.3.1.js"></script>
<script>
	function toRegister() {
		window.location.href = "register.html";
	}
	/* $(document).ready(function() {
		$(".submit").click(function() {
			$.post("login",
				{
					"username" : $("#username").val(),
					"password" : $("#password").val()
				} ,
				function(data) {
					var json = data[0];
					if (json.success == 0) {
						$(".error").text("用户名或密码错误！");
					} else if (json.success == 1) {
						window.location.href = "index.html";
					}
				} 
			)
		})
	}); */
</script>
</html>
