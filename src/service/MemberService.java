package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	
	public void  join();
	
	public ArrayList<MemberBean> list(String id,String name,String pass,String ssn);
	public ArrayList<MemberBean> findByname(String name);
	public MemberBean findByid(String id);
	public boolean existIdbyidpass(String id,String pass);
	public int findSomeCount();
	
	public void updatePass(String id,String pass,String newpass);
	public void deleteId(String id,String pass);
}
