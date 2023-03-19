<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/layout/header.jsp">
	<jsp:param name="title" value="Login" />
</jsp:include>

<form action="loginLogic.jsp" method="post">
	<table border="1">
		<caption>
			<h3>로그인</h3>
		</caption>
		<tr>
			<th>ID</th>
			<td><input type="text" name="user_id" placeholder="ID를 입력하세요."
				required></td>
		</tr>
		<tr>
			<th>PASSWORD</th>
			<td><input type="password" name="user_password"
				placeholder="PASSWORD를 입력하세요." required></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="LOGIN"> <a href="/myhome/findId/findIdView.jsp">아이디
					찾기</a></td>
		</tr>


	</table>

</form>
<jsp:include page="/layout/footer.jsp" />