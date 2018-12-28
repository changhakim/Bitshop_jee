<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String name = request.getParameter("name");
String accountNum = "";
for(int i =0;i<8;i++){
	Random random = new Random();
	accountNum += random.nextInt(10); 
}


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>이름 <%= name %></h3><br />
	<h3>계좌번호 <%= accountNum %></h3>
	<a href="../index.jsp">홈으로 이동</a>
</body>
</html>