package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDao {
	public void insertAccount(AccountBean account);
	public String createAccountNum();
	
	public ArrayList<AccountBean> selectAllAccounts();
	public AccountBean selectAccountsByAccountNum(String accountNum);
	public String selectAccountsByDate();
	public int counts();
	
	
	
	public void updateDeposit(String accountNum,int money);
	public void updateWithDraw(String accountNum,int money);
	
	public void deleteAccount(String accountNum);
}
