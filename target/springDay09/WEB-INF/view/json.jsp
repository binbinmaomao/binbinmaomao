<%--
  Created by IntelliJ IDEA.
  User: zengjin
  Date: 2020-6-17
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<head>
    <title>Title</title>
     <script src="https://cdn.staticfile.org/jquery/3.5.1/jquery.min.js"></script>
     <script type="text/javascript">
	$(function (){
     $("#btnJson1").click(function(){
    	  $.ajax({
    	   url:"${pageContext.request.contextPath}/bin/xiao",
    	   method:"PUT",
    	   data:'{"id":"12","name":"sunbo"}',
    	   contentType:'application/json',
    	   dataType:"json",
    	   success:function(user){
    	    //console.log(user.name);
    	    alert(user.name);
    	   }
    	  });
     	});
	});

	</script>
</head>
<body>

   
  <input type="button" value="发送单个参数的json数据" id="btnJson1"/><br/>

  
</body>
</html>