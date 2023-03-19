package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test01")
public class Test01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter(); //출력 스트림 하나를 얻어올 것이다
		String param = request.getParameter("name");
		out.write("<!DOCTYPE html>"); // 자바에서 HTML을 쓰는 것
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset = \"UTF-8\">");
		out.write("<title>나의 첫 서블릿</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("나의 첫 서블릿!");
		out.write(param + "님 환영합니다!");
		out.write("</body>");
		out.write("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
