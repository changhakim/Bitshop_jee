<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="domain.MemberBean"%>
<%
System.out.println("웰컴에 들어왓니");
MemberBean user =(MemberBean)request.getAttribute("member");
	%>
	 <%=user.getName() %> 님 환영합니다
	 <a href="member.do?cmd=logout">로그아웃</a>
	

