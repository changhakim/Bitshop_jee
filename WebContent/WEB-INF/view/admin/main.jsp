<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#wrapper{
	width: 100%;
	height: 100%;
	border: 1px solid gray;
	
}
#wrapper tr{
	
	border: 1px solid gray;
	
}
#wrapper tr td{
	
	border: 1px solid gray;
	
}

#first{

	
}
#side-menu{
	width: 30%;
}
#side-menu table tr{
	border :2px solid black;

}
/* #navi-bar {
			background-color: #FFDAB9;
			width: 150px;
			list-style-type: none;
			margin: 0;
			padding: 0;
		}
		#navi-bar li a {
			display: block;
			color: #000000;
			padding: 8px;
			text-decoration: none;
			font-weight: bold;
		}
		#navi-bar li a:hover {
			background-color: #CD853F;
			color: white;
		} */
#navi-bar {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

#navi-bar li {
  float: left;
}

#navi-bar li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

#navi-bar li a:hover {
  background-color: #111;
}	
		
		
		
		
		


		
</style>
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