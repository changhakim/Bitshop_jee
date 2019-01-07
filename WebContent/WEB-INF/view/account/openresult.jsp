<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="domain.*"%>

			<div id ="open-result">
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
		