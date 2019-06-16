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

<title>My JSP 'MyJsp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form action="${pageContext.request.contextPath }/questionnaire/add" method="post">
	        问卷题目：<input type="text" name="qName"/><br>
                    问卷数量：<input type="number" name="qCount"/><br>s
                    问卷备注：<input type="text" name="qRemark"/><br>
                    结束时间：<input type="date" name="endtime"/><br>
                    
      问题1：<input type="text" name="contentList[0].cTitle">
      答案1：<input type="text" name="answerList[0].answer[0].caAnswer">
      答案2：<input type="text" name="answerList[0].answer[1].caAnswer">
      答案3：<input type="text" name="answerList[0].answer[2].caAnswer">
      问题2：<input type="text" name="contentList[1].cTitle">
      答案1：<input type="text" name="answerList[1].answer[0].caAnswer">
      答案2：<input type="text" name="answerList[1].answer[1].caAnswer">
      答案3：<input type="text" name="answerList[1].answer[2].caAnswer">
      <input type="submit" name="" value="submit">
	</form>

</body>
</html>
