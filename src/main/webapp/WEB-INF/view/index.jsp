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
</head>
<body>
<!--  
   id:${role.id }<br>
  名前:${role.name }<br>
  誕生日:<spring:eval expression="role.brithday"></spring:eval><br> 
  金額:<spring:eval expression="role.money"></spring:eval><br>
  給料:<spring:eval expression="role.salary"></spring:eval><br>
  パーセント:<spring:eval expression="role.pasent"></spring:eval><br>
  趣味:<spring:eval expression="role.hibbys"></spring:eval>
   -->
   
   id:${role.id }<br>
  名前:${role.name }<br>
  誕生日:${role.brithday }<br> 
  金額:${role.money }<br>
  給料:${role.salary }<br>
  パーセント:${role.pasent }<br>
  趣味:${role.hibbys }
  
  password:${password}
   
  
  
</body>
</html>