<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="New_Login" method="post">
		Email<input type="text" name="email"/>
		Password<input type="password" name="password"/>
		<input type="submit" value="Login"/>
	</form>
	<%
		if(request.getAttribute("error")!=null){
			out.println(request.getAttribute("error"));
		}
	%>
</body>
</html>