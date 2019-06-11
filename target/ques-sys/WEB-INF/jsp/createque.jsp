<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>创建问卷</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="stylesheet" type="text/css" href="css/newform.css">
  </head>
  
  <body>
<div class="middle">
    <div id="info">
        <form action="" method="post">
            <fieldset>
                <legend>创建表单</legend>
                <div class="top">
                    问卷题目：<input type="text" name="qName"/><br>
                    问卷数量：<input type="number" name="qCount"/><br>
                    问卷备注：<input type="text" name="qRemark"/><br>
                    结束时间：<input type="date" name="endtime"/><br>
                </div>
            </fieldset>
            <div class="questionnaire" id="questionnaire">
                <div id="add">
                    <img src="images/add.png">
                </div>
            </div>
            <div class="bottom">
                <button type="submit" class="submit">提交表单</button>
            </div>
        </form>
    </div>
</div>
</body>
<script src="js/form.js"></script>
</html>
