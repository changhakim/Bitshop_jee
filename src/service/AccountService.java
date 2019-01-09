package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	
	public void createAccount(AccountBean account);
	public String createAccountNum();
	
	public ArrayList<AccountBean> retrieveAllAccounts();
	public AccountBean retrieveAccountsByAccountNum(String accountNum);
	public String findAccountsByDate();
	public int counts();
	
	
	
	public void deposit(String accountNum,int money);
	public void withDraw(String accountNum,int money);
	
	public void removeAccount(String accountNum);

}
