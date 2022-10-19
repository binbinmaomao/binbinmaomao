<%--
  Created by IntelliJ IDEA.
  User: zengjin
  Date: 2020-6-17
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <form:form action="/test02" method ="post" modelAttribute="role" >
 	<p>
 		
 		id:<form:input path="id"/><form:errors path="id" style="color:red"></form:errors><br>

 	</p>
 	<p>
 		name:<form:input path="name"/><form:errors path="name" ></form:errors><br>
 	</p>
 	<p>
 		brithday:<form:input path="brithday"/><form:errors path="brithday" ></form:errors><br>
 		
 	</p>
 	<p>
 		money:<form:input path="money"/><form:errors path="money"></form:errors><br>
 	</p>
 	<p>
 		salary:<form:input path="salary"/><form:errors path="salary"></form:errors><br>
 	</p>
 	<p>
 		pasent:<form:input path="pasent"/><form:errors path="pasent"></form:errors><br>
 	</p>
 	<p>
 		hibbys:<form:checkbox path="hibbys" value="旅行"/>
 		       <form:label path="hibbys">旅行</form:label>
 				<form:checkbox path="hibbys" value="ドライブ"/>
 		       <form:label path="hibbys">ドライブ</form:label>
 	</p>
 	<input type="submit" value="update">
 	
 </form:form>
 <p>password:${password}</p>
</body>
</html>