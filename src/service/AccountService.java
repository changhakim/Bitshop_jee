package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	
	public void createAccount(int money);
	public void accountNum();
	
	public ArrayList<AccountBean> list();
	public ArrayList<AccountBean> findall();
	public AccountBean findbyAccountNum(String accountNum);
	public int count();
	public String findDate();
	
	public void deposit(String accountNum,int money);
	public void withDraw(String accountNum,int money);
	
	public void deleteAccount(String accountNum);

}
