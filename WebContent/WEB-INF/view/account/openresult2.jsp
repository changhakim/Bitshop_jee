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
				<h1>비트 쇼핑몰</h1>
			</td>
			
		</tr>
		<tr>
			<td colspan="2">
				<ul id="navi-bar">
					<li ><a href="home.do">홈으로</a></li>
					<li ><a href="member.do">회원관리</a></li>
					<li style = background-color:blue;><a href="account.do">계좌관리</a></li>
					<li ><a href="article.do">게시판</a></li>
					<li ><a href="admin.do">관리자</a></li>
					
				</ul>
			
			</td>
			
		</tr>
		<tr style="height :300px">
			<td id="side-menu">
				
			</td>
			<td>
			<div>
			<form action="account.do">
			
				<h1 style="font-size: 30px; color: red;">계좌가 생성되었습니다.</h1>
				계좌번호: <br />
				잔액확인: <br />
				
			
			<input type="submit" id="btn" value="확인" />
			</form>
			</div>
			</td>
		</tr>
	</table>
	
	
</html>