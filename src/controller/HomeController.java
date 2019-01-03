package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/home.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dir = request.getParameter("dir");
		String cmd = request.getParameter("cmd");
		String page = request.getParameter("page");
		if(dir == null) {
		int	dd = request.getServletPath().indexOf(".");
			dir = request.getServletPath().substring(1, dd);
			System.out.println("-----"+dir);
		}
		if(page == null) {
			page = "main";
		}
		switch((cmd==null)?cmd="home":cmd) {
		case "home" : Command.move(request, response, dir+"/"+page);
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
