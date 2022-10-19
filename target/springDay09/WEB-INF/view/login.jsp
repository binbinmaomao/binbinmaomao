<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
 <form action="/user/sun" method="post">
 	id: <input name ="id" type="text"> <br>
    名前:<input name ="name" type = "text"> <br>
    hobbys : <input name ="hobbys" type ="checkbox" value = "トライイブ">　ドライブ
    　　　　　　　<input name ="hobbys" type ="checkbox" value = "旅行">　旅行　<br>
    role: <input name ="role.name" type ="text"> <br>
    <input type="submit" value ="提交">
 
 </form>

</body>
</html>