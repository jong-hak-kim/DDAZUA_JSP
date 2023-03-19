<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Sera's: ${ param.title != null ? param.title : "My WebPage!"}</title>
		<link rel="stylesheet" type="text/css" href="/myhome/layout/layout.css">
	</head>
	<body>
		<div align = "center">
			<div class = "header" align = "center">
			<c:choose>
			<c:when test = "${sessionScope.currentNickname == null }">
			<a href="/myhome/login/loginView.jsp">LOGIN</a> |
			<a href="/myhome/join/joinView.jsp">JOIN</a> |
			</c:when>
			<c:otherwise>
			${sessionScope.currentNickname }님 | 
			<a href="/myhome/logout/logoutLogic.jsp">LOGOUT</a> | 
			MY PAGE |
			</c:otherwise>
			</c:choose>
			BOARD |
			DOWNLOADS
			</div>
			<div class="main" align="center">
			

