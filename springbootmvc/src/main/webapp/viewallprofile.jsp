<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="com.springbootmvc.entity.faceuser" %>
<%@page import="java.util.ArrayList"%>

<% 
ArrayList<faceuser> fl = (ArrayList<faceuser>)request.getAttribute("result");
   
%>

	<% for (faceuser fu : fl) {  %>
    <p>---------------------------</p>
    <br>Name is <%= fu.getName() %>
    <br>Email is <%= fu.getEmail() %>
    <br>Password is <%= fu.getPassword() %>
<% 
    }
%>
