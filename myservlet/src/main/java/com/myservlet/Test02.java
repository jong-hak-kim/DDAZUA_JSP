package com.myservlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test02
 */
//@WebServlet("/Test02") // URL 매핑을 해줘야 함
						 // 어노테이션 사용하여 매핑
						 // web.xml에서 servlet과 servlet-mapping 사용
public class Test02 extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Test02의 init() 실행됨"); //최초로 클라이언트가 요청했을 때 객체 생성 그 이후에는 init메소드 실행되지 않음
	}

	public void destroy() {
		System.out.println("Test02의 destroy() 실행됨"); //톰캣을 stop 했을 시에 실행됨
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().write("Hello, This is Test02!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
