package com.goodjobedu.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// < 자바로 쿼리문 실행 >
// 1. 연결 (Connection)
// 2. 쿼리문 준비 (PreparedStatement)
// 3. 실행 (execute())
// 4. 정리 (close())

public class Test01 {
	public static void main(String[] args) {
		String id = "myJsp";
		String password = "jsppassword";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //URL : jdbe:oracle:드라이버타입:[계정명/비밀번호] @ [//]호스트명[:port][/XE]
		try {
			// Class.forName(클래스명) => 클래스를 찾겠다
			// => 찾으면서 + 클래스 로드(프로그램 시작 전에, 해당 클래스를 메모리에 로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connection : DB와 클래스를 연결하는 다리 역할
			Connection connection = DriverManager.getConnection(url, id, password);
			
			// 쿼리문 준비 작업 , 쿼리문을 날릴 때는 ;을 적지 않는다
			PreparedStatement ps = connection.prepareStatement("CREATE SEQUENCE student_seq NOCACHE");
			
			// 실행
			ps.execute();
			
			// ps 종료하여 정리
			ps.close();
			// 통로 정리
			connection.close();
			
			System.out.println("시퀀스 생성 완료!");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace(); // OracleDriver 클래스가 없을 때 발생
		} catch(SQLException e) {
			e.printStackTrace(); // 커넥션(DB와 연동)하는 과정에서 예외 발생
		}
	}
}
