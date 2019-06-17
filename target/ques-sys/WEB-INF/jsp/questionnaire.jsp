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
  <form>
  <input type="hidden" id = "qid" name="qid" value="${qid }"></input>
  </form>
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
   /* $.ready(function () { */
   		var qid = $('#qid').val();
        $.ajax({
            url:"questionnaire/showdata",
            type:"post",
            /* dataType:"", */
            data:"qid="+qid,
            success:function (data) {
                showForm(data);
            },
            error:function (data) {
				alert("问卷生成错误");
            }
        });
    /* }); */
   /* showForm(); */
</script>
</html>
