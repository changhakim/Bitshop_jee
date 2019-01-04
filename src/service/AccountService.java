package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	
	public String openAccount(int money);
	public String createAccountNum();
	
	public AccountBean findByAccountNum(String accountNum);
	public ArrayList<AccountBean> list();
	public ArrayList<AccountBean> findall();
	
	public int count();
	public String findDate();
	
	public void deposit(String accountNum,int money);
	public void withDraw(String accountNum,int money);
	
	public void deleteAccount(String accountNum);

}
