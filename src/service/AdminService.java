package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {

	public void createAdmins(AdminBean admin);
	
	public ArrayList<AdminBean> retrieveAdminsAll();
	public ArrayList<AdminBean> retrieveAdminsByAuth(String auth);
	public AdminBean retrieveAdminsByEmployeeNum(String adminNum);
	public int countAdmins();
	
	public void modifyEmployee(AdminBean admin);
	
	
	public void removeEmployee(String adminNum,String pass);
}
