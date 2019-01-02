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
		<img src="<%=application.getContextPath() %>/resources/img/images.jpg" alt="" />
	</div>
	<h1> 메뉴 </h1>
	<a href="member.do">회원관리</a><br />
	<a href="account.do">계좌관리</a><br />
	<a href="article.do">게시판</a><br />
	<a href="admin.do">관리자</a><br />
</body>
</html>