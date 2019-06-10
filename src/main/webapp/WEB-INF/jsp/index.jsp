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
    <style type="text/css">
    </style>
</head>

<body>
	<!-- 顶部-->
	<div class="top" id="nav">
		<ul class="headfl">
        <li><img src="images/logo.png" class="logo"></li>
    </ul>
		<ul class="info">
			<li>${user_state.uName }</li>
			<li><img src="images/more.png"></li>
		</ul>
		<div></div>
		<!-- 用户id -->
		<div>
			<form>
				<input type="hidden" id="uid" value="${user_state.uId }" />
			</form>
		</div>
	</div>
	<!--问卷-->
	<div class="content">
		<div class="add-list" onclick="addques()">
			<img src="images/add.png" onclick="javascript:location.href='${pageContext.request.contextPath }/ques/toAddPage'"/>创建问卷
		</div>
		<table class="list" cellspacing="0">
			<thead>
				<tr>
					<th>应用名称</th>
					<th>状态</th>
					<th>创建时间</th>
					<th>答卷量</th>
					<th>备注</th>
					<th>操作</th>
				</tr>
			</thead>

		</table>
		<!--页码-->
		<div class="page"></div>
	</div>
	<!-- 底部-->
	<div></div>
</body>

<script src="common/jquery-3.3.1.js"></script>
<script src="common/show.js"></script>
<script src="common/index.js"></script>
<script>
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
	function f1() {
	}
	function f(len, num) {
		var total = Math.ceil(len / num);
	}

	// 分享按钮
	function sharefun(data) {
		alert("分享链接为：http://localhost:8080/ques-sys/questionnaire/make?qid=" + data);
	}

	function tongjifun(data) {
		alert("开发中...");
	}

	function addques() {
		$.ajax({
			// 此处响应问卷数据
			url : "ques/toAddPage",
		});
	}

	function showData(data) {
		
		for (var i = 0; i < data.pageSize; i++) {
		var tbody = document.createElement("tbody");
			var state = "暂停服务";
			if (data.recordList[i].qState == true) {
				state = "服务中..."
			}
			var sharelink = data.recordList[i].qId;
			tbody.innerHTML ="<tr><td>" + data.recordList[i].qName +
				"</td><td><font color='green'>" + state +
				"</font></td><td>" + data.recordList[i].qCreatedate +
				"</td><td>" + data.recordList[i].qCount +
				"</td><td>" + data.recordList[i].qRemark +
				"</td><td>" + "<a onclick='sharefun(\"" + sharelink + "\")'>分享</a> " +
				"| <a onclick='tongjifun()'>统计</a> " +
				"| <a onclick='morefun()'>更多</a>" +
				"</td></tr>";
			document.querySelector(".list").appendChild(tbody);
		}
	}
</script>
</html>
