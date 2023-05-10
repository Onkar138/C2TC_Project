<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<h3>Update Data Here...</h3>
	<form action="Update" method="post">
		Email<input type="text" name="email" value=<%=request.getAttribute("email") %>/>
		Mobile<input type="text" name="mobile" value=<%=request.getAttribute("mobile") %>/>
		<input type="submit" value="Update"/>
	</form>
</body>
</html>