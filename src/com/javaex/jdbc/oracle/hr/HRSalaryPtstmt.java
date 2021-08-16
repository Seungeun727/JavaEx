package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

public class HRSalaryPtstmt {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("최소급여:");
		int minSalary = scanner.nextInt();
		System.out.print("최대급여:");
		int maxSalary = scanner.nextInt();
		
		if (minSalary > maxSalary) {
			//	값을 바꾼다
			int temp = minSalary;
			minSalary = maxSalary;
			maxSalary = temp;
		}
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			String sql = "SELECT first_name || ' ' || last_name as name, salary " +
					" FROM employees " +
					" WHERE salary BETWEEN ? AND ? " + 
					" ORDER BY salary";
			// pstmt = conn.prepareStatement(sql);
		
			 
			pstmt.setInt(1, minSalary);
			pstmt.setInt(2, maxSalary);
			
			rs = pstmt.executeQuery();
			
		
			while(rs.next()) {
				System.out.printf("%s\t%d%n", 
						rs.getString("name"), 
						rs.getInt(2));
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}

}