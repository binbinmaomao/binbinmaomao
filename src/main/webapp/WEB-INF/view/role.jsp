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
 <form action="/test" method ="post">
 	<p>
 		id:<input type="text" name ="id" value="${role.id}"> ${requestScope.error.id}<br>
 	</p>
 	<p>
 		name:<input type="text" name ="name" value="${role.name}"> ${requestScope.error.name}<br>
 	</p>
 	<p>
 		brithday:<input type="text" name ="brithday" value="${role.brithday} "> ${requestScope.error.brithday} <br>
 		
 	</p>
 	<p>
 		money:<input type="text" name ="money" value="${role.money}"> ${requestScope.error.money} <br>
 	</p>
 	<p>
 		salary:<input type="text" name ="salary" value="${role.salary}"><br>
 	</p>
 	<p>
 		pasent:<input type="text" name ="pasent" value="${role.pasent}"><br>
 	</p>
 	<p>
 		hibbys:<input type="checkbox" name ="hibbys" value="旅行">旅行
 		　　　　　<input type="checkbox" name ="hibbys" value="ドライブ">ドライブ　<br>
 	</p>
 	<input type="submit" value="update">
 	
 </form>

</body>
</html>