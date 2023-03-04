package com.goodjobedu.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test02 {
	public static void main(String[] args) {
		String id = "myJsp";
		String password = "jsppassword";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "CREATE TABLE account(" + "name VARCHAR2(20), " + "no NUMBER, " + "email VARCHAR2(20), "
				+ "point NUMBER, " + "regdate DATE" + ")";
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, id, password);
			ps = connection.prepareStatement(sql);
			ps.execute();
			System.out.println("Account 테이블 생성 완료!");
			ps = connection.prepareStatement("CREATE SEQUENCE acc_seq");
			ps.execute();
			System.out.println("acc_seq 시퀀스 생성 완료!");

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
