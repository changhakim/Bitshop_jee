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
		AccountBean account = null;
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
		String dest = request.getParameter("dest");
		dest=(dest==null)?"NONE":dest;
		switch(cmd) {
		case "move": 
		
			System.out.println("무브의 데스트"+dest);
			request.setAttribute("dest", dest);
			
			
			
			break;
		case "open-account":
			account = new AccountBean();
			System.out.println(dir+"-----dir-----");
			System.out.println(page+"------page-----");
			dest = request.getParameter("dest");
			
			account.setMoney(Integer.parseInt(request.getParameter("money")));
			AccountServiceImpl.getInstance().createAccount(account);
			
			
			if(dest==null) {
				dest = "open-result";
			}
			request.setAttribute("dest",dest);
			request.setAttribute("acc", "");
			
			break;
		case "open-form":
				
				request.setAttribute("dest",dest);
			break;	
		case "account-detail":
		
		case "showall":
			
			break;
		case "byaccountnum":
			
			break;
		case "accountcount":
			
			break;
		case "deposit":
			
			break;
		case "withdraw":
			
			break;
		case "removeac":
			
			break;
		}
		
		Command.move(request, response, dir, page);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
