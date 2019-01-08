package service;

import java.util.ArrayList;

import dao.MemberDaoImpl;
import domain.AccountBean;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private static  MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {return instance;}


	


	@Override
	public void joinMember(MemberBean member) {
		System.out.println("멤버서비스 조인에 진입");
		System.out.println("===컨트롤러에서 넘어온 회원정보====");
		System.out.println("ID:"+member.getId());
		System.out.println("이름:"+member.getName());
		System.out.println("비번:"+member.getPass());
		System.out.println("주번:"+member.getSsn());
		MemberDaoImpl.getInstance().insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> listMember(String id, String name, String pass, String ssn) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findByname(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findByid(String id) {
		MemberBean member = new MemberBean();
		return member;
	}

	@Override
	public int findSomeCount() {
		int count =0;
		return 0;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean ok = true;
		return ok;
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
