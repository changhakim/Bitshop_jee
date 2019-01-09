package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	
	public void  createMember(MemberBean member);

	public ArrayList<MemberBean> retrieveAllMembers();
	public ArrayList<MemberBean> retrieveByMembersByname(String name);
	public MemberBean retrieveMembersById(String id);
	public boolean existMember(String id,String pass);
	public int countMembers();

	public void modifyMember(MemberBean member);
	public void removeMember(String id,String pass);
}
