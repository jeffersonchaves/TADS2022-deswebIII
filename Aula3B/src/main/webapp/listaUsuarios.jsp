<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% List<String> usuarios = (List) request.getAttribute("usuarios"); %>

<h1>Lista Usuários</h1>

<ul>

<% for(String nome: usuarios){ 

	out.println("<li>" + nome + "</li>"); 

} %>

</ul>

</body>
</html>