package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import dao.AccountDaoImpl;
import dao.MemberDaoImpl;
import domain.AccountBean;


public class AccountServiceImpl implements AccountService{
	private static AccountServiceImpl instance = new AccountServiceImpl();
	private AccountServiceImpl() {
		dao = AccountDaoImpl.getInstance();
		}
	public static AccountServiceImpl getInstance() {return instance;}

	AccountDaoImpl dao;

	


	@Override
	public void createAccount(AccountBean account) {
		
		account.setAccountNum(createAccountNum());
		account.setToday(findAccountsByDate());
		
		AccountDaoImpl.getInstance().insertAccount(account);
		
		dao.insertAccount(account);
		
		
		
	}

	
	@Override
	public String createAccountNum() {
		String a = "";
		Random random = new Random();
		for(int i=0;i<12;i++) {
		a+=(i==3)?"-"+random.nextInt(10):random.nextInt(10);	
		}
		
		return a;
		
	}

	@Override
	public ArrayList<AccountBean> retrieveAllAccounts() {
		ArrayList<AccountBean> list = dao.selectAllAccounts();
		
		return list;
	}

	
	@Override
	public AccountBean retrieveAccountsByAccountNum(String accountNum) {
		AccountBean account = dao.selectAccountsByAccountNum(accountNum);
		
		return account;
	}
	
	
	
	@Override
	public String findAccountsByDate() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-DD-mm hh:mm:ss:aa");
		today = sdf.format(date);
		return today;
	}
	
	

	@Override
	public int counts() {
		int count = dao.counts();
		return count;
	}

	

	@Override
	public void deposit(String accountNum, int money) {
		dao.updateDeposit(accountNum, money);
		
	}

	@Override
	public void withDraw(String accountNum, int money) {
		dao.updateWithDraw(accountNum, money);
		
	}

	@Override
	public void removeAccount(String accountNum) {
		dao.deleteAccount(accountNum);
		
	}


	

}
