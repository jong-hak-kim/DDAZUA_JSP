package com.goodjobedu.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		String id = "myJsp";
		String password = "jsppassword";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, id, password);
			connection.prepareStatement(url);

			// Student 테이블에, 입력 받은 학생 이름, 연락처를 레코드로 추가해보자
			Scanner sc = new Scanner(System.in);
			String name;
			String tel;

			String sql = "UPDATE student SET st_kr = 80";
			ps = connection.prepareStatement(sql);
			int result = ps.executeUpdate(); // 몇 행이 적용(수정, 삭제, 추가) 됐는지 궁금할 때 사용
			System.out.println(result + "행에 적용되었습니다.");
			System.out.println("학생 추가 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
