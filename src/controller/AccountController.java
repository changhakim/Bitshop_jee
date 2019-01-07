package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountService accountService = new AccountServiceImpl();
		String dir = request.getParameter("dir");
		if(dir == null){
			int a = request.getServletPath().indexOf(".");
			dir = request.getServletPath().substring(1,a);
		}
		String cmd = request.getParameter("cmd");
		System.out.println("cmd-----"+cmd);
		cmd = (cmd == null)?"move":cmd;
		String page = request.getParameter("page");
		page = "main";
		System.out.println("page----"+page);
		
		switch(cmd) {
		case "move": 
			String dest = request.getParameter("dest");
			if(dest == null) {
				dest = "withdraw";
			}
			request.setAttribute("dest", dest);
			
			
			Command.move(request, response,dir,page);
			break;
		case "open-account":
			System.out.println(dir+"-----dir-----");
			System.out.println(page+"------page-----");
			dest = request.getParameter("dest");
			if(dest==null) {
				dest = "open-result";
			}
			request.setAttribute("dest",dest);
			String money = request.getParameter("money");
			System.out.println("계좌개설시 입금한 돈 ?"+money);
			String accNum = accountService.openAccount(Integer.parseInt(money));
			
			AccountBean acc = accountService.findByAccountNum(accNum);
			
			request.setAttribute("acc", acc);
			
			
			
			
			Command.move(request, response, dir, page);
			break;
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
