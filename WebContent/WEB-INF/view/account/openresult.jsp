<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="domain.*"%>
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
			<table>
					<tr>
						<td>계좌개설</td>
					</tr>
					<tr>
						<td>계좌목록</td>
					</tr>
					<tr>
						<td>계좌검색(이름)</td>
					</tr>
					<tr>
						<td>계좌검색(번호)</td>
					</tr>
					<tr>
						<td>총계좌수</td>
					</tr>
					<tr>
						<td>계좌번호체크</td>
					</tr>
					<tr>
						<td>입금</td>
					</tr>
					<tr>
						<td>출금</td>
					</tr>
					<tr>
						<td>계좌해지</td>
					</tr>
				</table>	
			</td>
			<td>
			<div>
			<form action="account.do">
			
				<h1 style="font-size: 30px; color: red;">계좌가 생성되었습니다.</h1>
				<%AccountBean acc = (AccountBean)request.getAttribute("acc");
				String accountNum = acc.getAccountNum();
				 String date =  acc.getToday();
				 String money = String.valueOf(acc.getMoney());
				 
				%>
				
				계좌번호: <%= accountNum %><br />
				생성날짜:<%= date %>
				잔액 : <%= money %>
			<input type="submit" id="btn" value="확인" />
			</form>
			</div>
			</td>
		</tr>
	</table>
	
	
</html>