package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pool.Constant;

public class Command {
	
	public static void move(HttpServletRequest request, 
			HttpServletResponse response,String dir,String page)throws ServletException, IOException {
		String a = "";
		System.out.println("dir:page:"+dir+page);
		if(page.equals("index")) {
		a ="index"+Constant.JSP;
		}else {
		a =Constant.VIEW + dir+"/"+page+ Constant.JSP;
		}
		System.out.println("a주소를알려줘"+a);
		request.getRequestDispatcher(a).forward(request, response);
		
		
			
		
		/*(path.equals("index")) ? "/index.jsp" : VIEW + "path" +JSP;*/
		/*request.getRequestDispatcher((page.equals("index"))?"index"+Constant.JSP:Constant.VIEW + dir+"/"+page+ Constant.JSP)
		.forward(request, response);*/
	}
}

