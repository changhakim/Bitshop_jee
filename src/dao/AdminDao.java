package dao;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminDao {

	public void insertAdmins(AdminBean admin);
	
	public ArrayList<AdminBean> selectAdminsAll();
	public ArrayList<AdminBean> selectAdminsByAuth(String auth);
	public AdminBean selectAdminsByEmployeeNum(String adminNum);
	public int countAdmins();
	
	public void updateEmployee(AdminBean admin);
	
	
	public void deleteEmployee(String adminNum,String pass);
}
