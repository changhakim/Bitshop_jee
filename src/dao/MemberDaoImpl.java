package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;

import domain.MemberBean;
import factory.DatabaseFactory;
import pool.Constant;

public class MemberDaoImpl implements MemberDao{
	private static MemberDaoImpl instance = new MemberDaoImpl();
	private MemberDaoImpl() {}
	public static MemberDaoImpl getInstance() {return instance;}


	@Override
	public void insertMember(MemberBean member) {
		try {
		int rs = DatabaseFactory
			.createDatabase("oracle")
			.getConnection()
			.createStatement().executeUpdate(String.format(
					"INSERT INTO member(id, name, pass, ssn) \n"
					+ "VALUES('%s', '%s', '%s', '%s')",
					member.getId(),member.getName(),
					member.getPass(), member.getSsn()));
		if(rs == 1) {
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
	public ArrayList<MemberBean> selectAllMembers() {
		
		
		return null;
	}

	@Override
	public ArrayList<MemberBean> selectMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			ResultSet rs = DatabaseFactory
					.createDatabase("oracle")
					.getConnection()
					.createStatement()
					.executeQuery(name);
			while(rs.next()) {
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member =null;
		try {
			ResultSet rs = DatabaseFactory
			.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeQuery(String.format("SELECT * FROM member\n" + 
					"WHERE id LIKE '%s'", id));
			while(rs.next()) {
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
		
		return member;
	}

	@Override
	public MemberBean existByIDPass(String id, String pass) {
		MemberBean member = null;
		try {
			ResultSet rs =DatabaseFactory.
			createDatabase("oracle").
			getConnection().
			createStatement().
			executeQuery(String.format("SELECT * FROM member\r\n" + 
					"WHERE id LIKE '%s' AND PASS LIKE'%s'", id,pass));
			while(rs.next()) {
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setPass(rs.getString("pass"));
				member.setName(rs.getString("name"));
				member.setSsn(rs.getString("ssn"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return member;
	}
	
	@Override
	public int countMembers() {
		
		return 0;
	}

	@Override
	public void updateMember(MemberBean member) {
		
	}

	@Override
	public void deleteMember(String id, String pass) {
		
	}
	

}
