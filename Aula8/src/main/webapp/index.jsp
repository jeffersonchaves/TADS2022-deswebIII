<%@page import="app.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<% 

	Usuario usuario = (Usuario) session.getAttribute("usuario"); 
	
	Boolean estaLogado = (Boolean) session.getAttribute("esta_logado");
	
	
	if(estaLogado == null || estaLogado == false){
		
		response.sendRedirect("login.jsp");
		
	}

	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="logout"> desconectar </a>

<h1>Bem vindo: <%= usuario %></h1>

</body>
</html>