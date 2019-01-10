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
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = null;
		String dir = request.getParameter("dir");
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
			boolean loginok = service.existMember(id, pass);
			System.out.println("참거짓"+loginok);
			if(loginok) {
				member = new MemberBean();
				request.setAttribute("dest", dest);
				member = service.retrieveMembersById(request.getParameter("uid"));
				request.setAttribute("member", member);
			}else {
				dir = "";
				page = "index";
			}
			
			
				
				
			
			
			break;
		case "move":
			
			System.out.println("move로 들어옴");
			dest = (dest==null)?"NONE":dest;
			System.out.println("DEST"+dest);
			request.setAttribute("dest",dest );
			
			
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
			member = service.retrieveMembersById(request.getParameter("id"));
			System.out.println("컨트롤러 멤버 네임"+member.getName());
			request.setAttribute("member", member);
			
			break;
		case "logout":
			dir = "";
			page = "index";
			dest = "";
			break;	
		case "showall":break;
		case "showbyname":break;
		case "showbyid":break;
		case "showcount":break;
		case "modifymember":break;
		case "removemember":break;
		
		}
		Command.move(request, response,dir,page);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
