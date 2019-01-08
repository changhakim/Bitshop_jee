package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	
	public void  joinMember(MemberBean member);

	public ArrayList<MemberBean> listMember(String id,String name,String pass,String ssn);
	public ArrayList<MemberBean> findByname(String name);
	public MemberBean findByid(String id);
	public int findSomeCount();
	public boolean existMember(String id,String pass);

	public void updatePass(String id,String pass,String newpass);
	public void deleteId(String id,String pass);
}
