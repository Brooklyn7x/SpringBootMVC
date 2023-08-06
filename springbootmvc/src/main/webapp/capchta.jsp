<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>



<%
		Integer rr=(Integer)request.getAttribute("result");
%>
	
			
		Captcha Value <input type=text value=<%= rr %> id=c disabled>
			<button type=button onClick=loadCaptcha()>Refresh</button>
			<br>Enter The Above Captcha Value <input type=text id=cc1>
		<button type=button onClick=validatecaptcha()>Validate</button>