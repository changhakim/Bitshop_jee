package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;   //null인저장소
		ResultSet rs = null;	//null인 저장소	

	try {
		Class.forName("oracle.jdbc.OracleDriver");//드라이버호출(클래스)
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM member");
		String name = "";
		while(rs.next()) {
			name = rs.getString("name");
		}//rs에 값이 있으면 true
		System.out.println("회원의 이름은"+name);
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}finally {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

}
