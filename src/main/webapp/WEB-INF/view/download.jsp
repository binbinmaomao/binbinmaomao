<%--
  Created by IntelliJ IDEA.
  User: zengjin
  Date: 2020-6-17
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
 <a href="/download/sun">downloaddowanload</a>
 
<form enctype ="multipart/form-data" action="testUpload" method="post">
   文件: <input type="file" name="file"/><br><br>
   描述: <input type="text" name="desc"/><br><br>
   <input type="submit" value="提交"/>
</form>
</body>
</html>