package com.myhome.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myhome.dao.MemberDao;
import com.myhome.dto.MemberDto;

@WebServlet("/login/loginLogic.jsp")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("user_id");
		String password = request.getParameter("user_password");

		MemberDao dao = new MemberDao();
		MemberDto dto = dao.select(id, password);

		if (dto != null) {
			request.setAttribute("nickname", dto.getNickname());
		}
//		pageContext.forward("loginResultView.jsp");
		
		RequestDispatcher rd = request.getRequestDispatcher("loginResultView.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}