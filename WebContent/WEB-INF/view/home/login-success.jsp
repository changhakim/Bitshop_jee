<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = String.valueOf(request.getAttribute("name"));
if(
		name.equals("test")){
	%>
	 <%=name %> 님 환영합니다
	<%
}

%>