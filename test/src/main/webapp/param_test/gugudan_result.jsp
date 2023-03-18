<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//String sUserDab = request.getParameter("userDab");
	//int userDab = Integer.parseInt(sUserDab);
	int userDab = Integer.parseInt(request.getParameter("userDab"));
	int realDab = Integer.parseInt(request.getParameter("realDab"));
	String message = userDab == realDab ? "정답!" : "땡..";
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= message %>
</body>
</html>