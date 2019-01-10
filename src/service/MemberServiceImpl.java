package service;

import java.util.ArrayList;

import dao.MemberDaoImpl;
import domain.AccountBean;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private static  MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getInstance();
	}
	public static MemberServiceImpl getInstance() {return instance;}

	
	MemberDaoImpl dao;


	@Override
	public void createMember(MemberBean member) {
		System.out.println("멤버서비스 조인에 진입");
		System.out.println("===컨트롤러에서 넘어온 회원정보====");
		System.out.println("ID:"+member.getId());
		System.out.println("이름:"+member.getName());
		System.out.println("비번:"+member.getPass());
		System.out.println("주번:"+member.getSsn());
		dao.insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> retrieveAllMembers() {
		ArrayList<MemberBean> list = dao.selectAllMembers();
		
		return list;
	}

	@Override
	public ArrayList<MemberBean> retrieveByMembersByname(String name) {
		ArrayList<MemberBean> list = dao.selectMembersByName(name);
		return list;
	}

	@Override
	public MemberBean retrieveMembersById(String id) {
		return dao.selectMemberById(id);
	}

	@Override
	public int countMembers() {
		int count =dao.countMembers();
		
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean ok = true;
		MemberBean member = dao.existByIDPass(id, pass);
		if(member == null) {
			ok = false;
		}
		System.out.println("ok"+ok);
		/*boolean ok = false;
		MemberBean member = dao.existByIDPass(id, pass);
		if(member.getId().equals(id)&& member.getPass().equals(pass)) {
			ok = true;
		}*/
		
		return ok;
		
	}

	@Override
	public void modifyMember(MemberBean member) {
		dao.updateMember(member);
		
	}

	@Override
	public void removeMember(String id,String pass) {
		dao.deleteMember(id, pass);
		
	}

}
