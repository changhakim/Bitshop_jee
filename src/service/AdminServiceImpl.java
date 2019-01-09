package service;

import java.util.ArrayList;

import dao.AdminDaoImpl;
import domain.AdminBean;

public class AdminServiceImpl implements AdminService {
	private static AdminServiceImpl instance = new AdminServiceImpl();
	private AdminServiceImpl() {
	 dao = AdminDaoImpl.getInstance();
	}
	public static AdminServiceImpl getInstance() {return instance;}

	AdminDaoImpl dao;
	
	@Override
	public void createAdmins(AdminBean admin) {
		dao.insertAdmins(admin);
		
	}
	@Override
	public ArrayList<AdminBean> retrieveAdminsAll() {
		ArrayList<AdminBean> list = dao.selectAdminsAll();
		return list;
	}

	@Override
	public ArrayList<AdminBean> retrieveAdminsByAuth(String auth) {
		ArrayList<AdminBean> list = dao.selectAdminsByAuth(auth);
		return list;
	}

	@Override
	public AdminBean retrieveAdminsByEmployeeNum(String adminNum) {
		AdminBean admin = dao.selectAdminsByEmployeeNum(adminNum);
		return admin;
	}

	@Override
	public int countAdmins() {
		int a = dao.countAdmins();
		return a;
	}

	@Override
	public void modifyEmployee(AdminBean admin) {
		dao.updateEmployee(admin);
		
	}

	

	@Override
	public void removeEmployee(String adminNum, String pass) {
		dao.deleteEmployee(adminNum, pass);
		
	}
	

}
