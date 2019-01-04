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
					<li ><a href="account.do">계좌관리</a></li>
					<li ><a href="article.do">게시판</a></li>
					<li style="background-color:blue;"><a href="admin.do">관리자</a></li>
					
				</ul>
			
			</td>
			
		</tr>
		<tr style="height :300px">
			<td id="side-menu">
				<table>
					<tr>
						<td>사원목록</td>
					</tr>
					<tr>
						<td>직급으로찾기</td>
					</tr>
					<tr>
						<td>사원번호로찾기</td>
					</tr>
					<tr>
						<td>사원번호확인</td>
					</tr>
					<tr>
						<td>전체사원수</td>
					</tr>
					<tr>
						<td>아이디삭제</td>
					</tr>
					
				</table>
			</td>
			<td></td>
		</tr>
	</table>
	
	
</html>