<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String s = request.getParameter("aa");
	// "아무거나!"
	String ss = request.getParameter("Aa");
	// null (잘못된 파라미터를 받아올 경우 null을 들고온다)
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	입력받은 값 : <%= s %> <br>
	입력받은 값 : <%= ss %>
</body>
</html>