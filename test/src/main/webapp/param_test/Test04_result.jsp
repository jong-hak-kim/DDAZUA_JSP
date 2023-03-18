<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//모든 파라미터를 받는 메소드
		Map<String, String[]> map = request.getParameterMap();
		//   Key   , Value
		// Key : 파라미터 이름
		// Value : 파라미터의 값(들)
		Set<String> pNames = map.keySet();
		String[] pValues = null;
		for(String p : pNames){
			pValues = map.get(p); //모든 파라미터 이름을 한번씩 다 꺼낸다.
			out.write("파라미터 명 : " + p + "<br>");
			out.write("파라미터 값 : ");
			for(String val : pValues){ //모든 값들을 다 꺼낸다
				out.write(val + " ");
			}
			out.write("<br>");
		}
	%>
</body>
</html>