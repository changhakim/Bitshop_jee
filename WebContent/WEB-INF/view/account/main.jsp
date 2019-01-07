<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../home/head.jsp" %>
<body>
	
	<table id ="wrapper">
		
		<tr id = "first">
			
			<td colspan="2">
				<%@ include file="../home/header.jsp" %>
			</td>
			
		</tr>
	
		<tr>
			<td colspan="2">
				<%@ include file = "../home/navi-var.jsp" %>
			</td>
			
		</tr>
		<tr style="height :300px">
			
			<td style = "width:30%">
			<%@ include file="side-menu.jsp" %>
				
			</td>
			<td>
				<%
				String dest = String.valueOf(request.getAttribute("dest"));
				System.out.println("메인의dest-----"+dest);
				
				switch(dest){
				case "withdraw":%><%@ include file ="withdraw.jsp" %>
				
				<%
				break;
				case "open-result":%><%@ include file = "openresult.jsp"  %>
				<%
					break;
				
				}
				%>
				
			</td>
		</tr>
	</table>
	
	
</html>