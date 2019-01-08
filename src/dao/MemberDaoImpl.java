package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;

public class MemberDaoImpl implements MemberDao{
	private static MemberDaoImpl instance = new MemberDaoImpl();
	private MemberDaoImpl() {}
	public static MemberDaoImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	

	@Override
	public void insertMember(MemberBean member) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("INSERT INTO member(id,name,pass,ssn)\n"
					+ "VALUES('%s', '%s', '%s', '%s')", member.getId(),member.getName(),
					member.getPass(),member.getSsn());
			
			
			System.out.println("SQL :::"+sql);
			//rs =stmt.executeQuery(sql);//조회
			int a = stmt.executeUpdate(sql);//인서트 딜리트 업데이트
			if(a==1){
				System.out.println("회원가입성공");
			}else {
				System.out.println("회원가입실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ArrayList<MemberBean> selectMember(String id, String name, String pass, String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberBean> selectByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectByid(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int CountMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updatePass(String id, String pass, String newpass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteId(String id, String pass) {
		// TODO Auto-generated method stub
		
	}

}
