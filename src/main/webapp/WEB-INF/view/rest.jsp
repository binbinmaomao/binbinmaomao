<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
  	<form action="/rest/user/1" method="get">
  		<input type="submit" value ="查询"><br>
  	</form>
  	
  	<form action="/rest/user" method="post">
  	    id: <input name ="id" type="text"> <br>
    	名前:<input name ="name" type = "text"> <br>
  		<input type="submit" value ="添加">
  	</form>
  	
  	<form action="/rest/user/2" method="post">
  		<input type="hidden" value="put" name="_method">
  	    id: <input name ="id" type="text"> <br>
    	名前:<input name ="name" type = "text"> <br>
  		<input type="submit" value ="改修">
  	</form>
  	
  	<form action="/rest/user/3" method="post">
  		<input type="hidden" value="delete" name="_method">
  	    id: <input name ="id" type="text"> <br>
    	名前:<input name ="name" type = "text"> <br>
  		<input type="submit" value ="delete">
  	</form>
</body>
</html>