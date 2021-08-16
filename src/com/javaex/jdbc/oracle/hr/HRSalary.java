package com.javaex.jdbc.oracle;

// 1. Driver_.jar
// 2. DriverManager
// 3. Statement _Sql Setting
// 4. 수행 -> ResultSet

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class HRSalary {
	public static void main(String[] args) {
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
    		// @:주소, 1521:포트번호, xe: 식별자
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("최소급여:");     // 10000입력
		int minSalary = scanner.nextInt();
		System.out.print("최대급여:");
		int maxSalary = scanner.nextInt();  // 2000 입력
		
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
					" WHERE salary BETWEEN " + minSalary + " AND " + maxSalary + 
					" ORDER BY salary";
			// min값과 max값이 바뀌게 되면 Between 작은값 and 큰값
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
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
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}
}