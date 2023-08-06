<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.springbootmvc.entity.country" %>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>

<%             ArrayList<country> fl = (ArrayList<country>)request.getAttribute("result");
				
%>

<select>
  <% for (country cc : fl) { %>
    <option> <%= cc.getName() %> </option>
  <% } %>
</select>
