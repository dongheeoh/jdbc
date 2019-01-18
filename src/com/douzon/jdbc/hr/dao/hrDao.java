package com.douzon.jdbc.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.douzon.jdbc.hr.vo.hrVo;

public class hrDao {
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://127.0.0.1:3306/employees";
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		}
		
		return conn;
	}
	public List<hrVo> getList(String spell){
		List<hrVo> list = new ArrayList<hrVo>();
				
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				boolean result = false;
				
				try {
					conn = getConnection();
					PreparedStatement pstmt = null;

					String sql = "select a.first_name,a.hire_date "+"  from employees a "+"  where first_name like "+"'%?%'"+" or last_name like "+"'%?%'";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, spell);
					pstmt.setString(2, spell);
					
					int count=pstmt.executeUpdate();
					result=count==1;
					
					rs = pstmt.executeQuery(sql);
					
					while(rs.next()) {
						int emp_no=rs.getInt(1);
						String first_name=rs.getString(2);
						Date hire_date=rs.getDate(3);
						String last_name=rs.getString(4);
						int salary=rs.getInt(5);
						
						hrVo vo = new hrVo();
						vo.setEmp_no(emp_no);
						vo.setFirst_name(first_name);
						vo.setHire_date(hire_date);
						vo.setLast_name(last_name);
						vo.setSalary(salary);
						
						list.add(vo);
					}
					
				} catch (SQLException e) {
					System.out.println("error:" + e);
				} finally {
					try {
						if(rs != null) {
							rs.close();
						}
						if(stmt != null) {
							stmt.close();
						}
						if(conn != null) {
							conn.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return list;
			}

}
