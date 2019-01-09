package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;




@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberBean member = null;
		String dir = request.getParameter("dir");
		System.out.println("멤버컨트롤러로들오와라제발");
		if(dir == null){
			int a = request.getServletPath().indexOf(".");
			dir = request.getServletPath().substring(1,a);
		}
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null)?"move":cmd;
		String page = request.getParameter("page");
		page = (page == null)?"main":page;
		System.out.println("move----"+cmd);
		String dest = request.getParameter("dest");
		switch(cmd) {
		case "login":
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");
			System.out.println("아이디="+id+"비밀번호="+pass);
			
			if(!(id.equals("test")&&pass.equals("test"))) {
				dir = "";
				page = "index";
			}
			request.setAttribute("name", "test");
			request.setAttribute("compo", "login-success");
				Command.move(request, response,dir,page);
				
			
			
			break;
		case "move":
			
			System.out.println("move로 들어옴");
			dest = (dest==null)?"NONE":dest;
			System.out.println("DEST"+dest);
			request.setAttribute("dest",dest );
			Command.move(request, response,dir,page);
			
			break;
		case "join":
			System.out.println("join으로 들어옴");
			dest = (dest==null)?"NONE":dest;
			request.setAttribute("dest",dest );
			member = new MemberBean();
			
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().createMember(member);
			request.setAttribute("member", member);
			MemberServiceImpl.getInstance().retrieveMembersById(request.getParameter("id"));
			Command.move(request, response,dir,page);
			break;
		case "showall":break;
		case "showbyname":break;
		case "showbyid":break;
		case "showcount":break;
		case "modifymember":break;
		case "removemember":break;
		
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
