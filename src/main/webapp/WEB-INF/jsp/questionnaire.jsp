<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>${quesname }</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/show.css">
  </head>
  
  <body>
<div class="middle">
    <div class="info">
        <div class="top">
            <div id="headline"><h2></h2></div>
            <p>感谢您能抽出时间来参与本次答题，请回答下列问题！</p>
        </div>
        <div id="content">

        </div>
        <div id="error" class="cue"></div>
        <input type="button" value="提交" id="button" onclick="submitForm()">
    </div>
</div>
</body>
<script src="js/jquery-3.3.1.js"></script>
<script src="js/show.js"></script>
<script>
   /* $.ready(function () {
        $.ajax({
            url:"",
            type:"post",
            dataType:"",
            data:{},
            success:function () {
                showForm(data);
            },
            error:function () {

            }
        });
    });*/
   showForm();
</script>
</html>
