package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDao {
	public void  insertMember(MemberBean member);

	public ArrayList<MemberBean> selectAllMembers();
	public ArrayList<MemberBean> selectMembersByName(String name);
	public MemberBean selectMemberById(String id);
	public boolean existByIDPass(String id,String pass);
	public int countMembers();
	
	public void updateMember(MemberBean member);
	public void deleteMember(String id,String pass);
}
