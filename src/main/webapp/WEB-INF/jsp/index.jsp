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

<title>问卷系统管理页面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta name="keywords" content="问卷调查，调查问卷，满意度调查，市场调查，问卷">
<meta name="description" content="免费问卷调查平台">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="shortcut icon" href="favicon.ico" />
<link rel="stylesheet" type="text/css" href="css/index.css">
<link href="https://cdn.bootcss.com/jquery-confirm/3.3.4/jquery-confirm.min.css" rel="stylesheet">
    <style type="text/css">
    </style>
</head>

<body>
	<!-- 顶部-->
	<div class="top" id="nav">
		<ul class="headfl">
        <li><img src="images/logo.png" class="logo"></li>
    </ul>
    <ul class="info" id="info">
        <li id="user">${user_state.uName }<img src="images/more.png"></li>
    </ul>
		<!-- 用户id -->
		<div>
			<form>
				<input type="hidden" id="uid" value="${user_state.uId }" />
				<input id="PageContext" type="hidden" value="${pageContext.request.contextPath}" />
			</form>
		</div>
	</div>
<!--问卷-->
<div class="content">
    <div class="add-list">
       <i></i><span>创建问卷</span>
    </div>
    <form id="data" onhaschange="changeForm()">
    <table class="list" cellspacing="0">
        <thead>
        <tr>
            <th class="headline">应用名称</th>
            <th class="condition">状态</th>
            <th class="creation">创建时间</th>
            <th class="quantity">答卷量</th>
            <th class="remarks">备注</th>
            <th class="handle">操作</th>
        </tr>
        </thead>
    </table>
    <!--页码-->
    <!--<div class="page"></div>-->
    </form>
</div>
<!-- 底部-->
</body>

<script src="common/jquery-3.3.1.js"></script>
<script src="https://cdn.bootcss.com/jquery-confirm/3.3.4/jquery-confirm.min.js"></script>
<script src="js/show.js"></script>
<script src="js/index.js"></script>

<script>
	/* $.ajax({
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
	}); */

	/* showData(data); */
</script>
</html>
