package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {

	public void createEmployee();
	
	public ArrayList<AdminBean> listAll();
	public ArrayList<AdminBean> findbyauth(String auth);
	public AdminBean findbyEmployeeNum(String adminNum);
	public boolean findByEmployeeNumPass(String adminNum,String pass);
	public int countAdmin();
	
	public void updatebyPass(String adminNum,String pass,String newPass);
	public void updatebyAuth(String adminNum,String pass,String auth);
	
	public void deleteEmployee(String adminNum,String pass);
}
