<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList"%>
 <%@ page import="com.springbootmvc.entity.faceuser" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>____</title>
</head>
<body>
<%              String email = session.getAttribute("userid").toString();
%>
	 			<br>Welcome <%= email %>
	 			
	 			
				<br><a href=viewprofile>View profile</a> 
				<br><a href=edit.html>Edit profile</a> 
				<br><a href=deleteprofileservlet>Delete profile</a>
				<br><a href=search.html>Search profile</a> 
				<br><a href=viewallprofile>View all profile</a> 
				<br><a href=friendslist>Pending Friends Requests</a> 
				<br><a href=messages>Message</a> 
				<br><a href=acceptfriends>Friends Requests</a> 
				<br><a href=RealFriendsList>Friends</a> 
				<br><a href=logoutservrlet>Logout</a>
				
				
				
				
			
				
				
</html>