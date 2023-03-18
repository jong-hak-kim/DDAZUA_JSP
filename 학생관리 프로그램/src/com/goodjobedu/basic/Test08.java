package com.goodjobedu.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test08 {
	public static void main(String[] args) {
		String id = "myJsp";
		String password = "jsppassword";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, id, password);
			sql = "SELECT st_name, st_kr, st_no, st_avg FROM student WHERE st_avg >= 80";
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			String name;
			int kr;
			int no;
			double avg;
			System.out.println("====== 1번 문제 ======");
			while(rs.next()) {
				name = rs.getString("st_name");
				kr = rs.getInt("st_kr");
				no = rs.getInt("st_no");
				avg = rs.getDouble("st_avg");
				
				System.out.println("이름 : " + name);
				System.out.println("국어 점수 : " + kr);
				System.out.println("학번 : " + no);
				System.out.println("평균 점수 : " + avg + "점");
			}
			
			ps.close();
			rs.close();
			System.out.println();
			System.out.println("====== 2번 문제 ======");
			sql = "SELECT st_name, st_no, st_tel FROM student WHERE st_name LIKE '김%' ORDER BY st_name ASC";
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			String tel;
			while(rs.next()) {
				name = rs.getString("st_name");
				no = rs.getInt("st_no");
				tel = rs.getString("st_tel");
				System.out.println("이름 : " + name);
				System.out.println("학번 : " + no);
				System.out.println("전화번호 : " + tel);
			}
			
			ps.close();
			rs.close();
			
			System.out.println();
			System.out.println("====== 3번 문제 ======");
			sql = "DELETE sFROM student WHERE st_regdate = (SELECT MAX(st_regdate) FROM student)";
			ps = connection.prepareStatement(sql);
//			System.out.println(ps.executeUpdate() + "개 레코드가 삭제됨.");
			
			ps.close();
			
			System.out.println();
			System.out.println("====== 3번 문제 ======");
			sql = "SELECT st_name, st_avg FROM student WHERE st_avg = (SELECT MAX(st_avg) FROM student)";
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			rs.next();
			System.out.println("1등의 이름 : " + rs.getString("st_name"));
			System.out.println("1등의 평균 점수 : " + rs.getDouble("st_avg"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
