<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/style.css" />
</head>
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
				
				<%
				String dest = String.valueOf(request.getAttribute("dest")) ;
				if(dest.equals("join-form")){
					%><%@ include file ="side-join.jsp" %><%
				}else{
					%><%@ include file="side-menu.jsp" %> <%
				}
				%>
				
				
			</td>
			<td>
			<%
			dest = String.valueOf(request.getAttribute("dest"));			
			
			System.out.println("메인의 dest"+dest);
			switch(dest){
			
			case "NONE" :
				%>
				
				<%
				break;
			case "join-form":
				%><%@ include file="join-form.jsp" %> 
				<%
				break;
			case "detail":	%><%@ include file="member-detail.jsp" %> 
			<%
			break;
			case "member-update": %><%@ include file="member_update.jsp" %> <%
			
			break;
			}
			%>
			</td>
		</tr>
	</table>
	
	
</html>