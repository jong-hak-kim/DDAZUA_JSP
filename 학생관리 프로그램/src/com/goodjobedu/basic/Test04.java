package com.goodjobedu.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test04 {
	public static void main(String[] args) throws IOException {
		String id = "myJsp";
		String password = "jsppassword";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection connection = null;
		PreparedStatement ps = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String name = st.nextToken();
		String email = st.nextToken();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, id, password);
			ps = connection.prepareStatement(
					"INSERT INTO account VALUES('" + name + "', acc_seq.NEXTVAL, '" + email + "', 1000, SYSDATE)");
			ps.execute();
			System.out.println("정보 추가 완료");
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
