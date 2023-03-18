<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); // post 방식으로 받은 파라미터는 무조건 %>
	<%= request.getParameter("user_name") %> <br>
	<%= request.getParameter("user_age") %> 
</body>
</html>