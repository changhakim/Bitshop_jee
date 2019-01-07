package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDao {
	public void  createMember();

	public ArrayList<MemberBean> selectMember(String id,String name,String pass,String ssn);
	public ArrayList<MemberBean> selectByname(String name);
	public MemberBean selectByid(String id);
	public int CountMember();
	
	public void updatePass(String id,String pass,String newpass);
	public void deleteId(String id,String pass);
}
