<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<img src="<%=request.getContextPath() %>/resources/img/images.jpg" alt="" />
	</div>
	<h1> 메뉴 </h1>
	<a href="member/main.jsp">회원관리</a><br />
	<a href="account/main.jsp">계좌관리</a><br />
	<a href="">게시판</a><br />
	<a href="">관리자</a><br />
</body>
</html>