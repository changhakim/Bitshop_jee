	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<% 
	
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	
	
	String ssn = request.getParameter("ssn");
	String year = ssn.substring(0,2);
	String month = ssn.substring(2,4);
	String day = ssn.substring(4,6);
	String gender = request.getParameter("gender");
	
	
	switch(ssn.charAt(7)){
	case '1' :gender = "남"; break;
	case '2' :gender = "여"; break;
	case '3' :gender = "남"; break;
	case '4' :gender = "여"; break;
	case '5' :gender = "외국인"; break;
	case '6' :gender = "외국인"; break;
	default : gender = "이상한 번호";break;
	
	}
	
	
	double w = Double.parseDouble(request.getParameter("weight")) ;
	double h = Double.parseDouble(request.getParameter("height")) ;
	double bmi = w / (h * h) * 10000;
	String state = "";
	if(bmi>45.0){
		state = "고도 비만";
	}else if(bmi>35.0){
		state = "중등도 비만";
	}else if(bmi>30){
		state = "경도 비만";
	}else if(bmi>25){
		state = "과체중";
	}else if(bmi>18.5){
		state = "정상";
	}else{
		state = "저체중";
	}
	
	%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
	 
	 <h3>가입한 ID:<%= id %></h3><br />
	 <h3>이름:<%=name %></h3><br />
	 <h3>가입한 비밀번호: *****</h3><br />
	 <h3>생년월일  : <%=year %>년 <%= month %> 월 <%= day %>일생</h3><br />
	 <h3>성별 : <%= gender %></h3><br />
	 <h3>BMI : <%= bmi %></h3><br />
	 <a href="login-form.jsp">로그인으로 이동</a><br />
	 <a href="../index.jsp">홈으로이동</a>
	</body>
	</html>