<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>



<%              String name = request.getAttribute("name").toString();
				String email = request.getAttribute("email").toString();
				String password = request.getAttribute("password").toString();
%>


<%= name %>
<%= email %>
<%= password %>

<a href=login.html> Continue...</a>