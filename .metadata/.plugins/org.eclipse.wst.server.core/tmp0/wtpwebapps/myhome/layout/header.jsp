<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jonghak's : ${param.title != null ? param.title : "My WebPage!"}</title>
<link rel="stylesheet" type="text/css" href="/myhome/layout/layout.css">
</head>
<body>
	<div align="center">
		<div class="header" align="center">
			<a href="/myhome/login/loginView.jsp">LOGIN |</a> LOGOUT | <a
				href="/myhome/join/joinview.jsp">JOIN | </a> MY PAGE | BOARD |
			DOWNLOADS
		</div>
		<div class="main" align="center">