<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
	//cast 
	//coercao
	String erro = (String) request.getAttribute("erro");
	
	%>
	
	<% if(erro != null){ %>
		<p><% out.println(erro); %></p>
	<% } %>

	<form method="post" action="http://localhost:8080/Atividade2/processa">
	
		
		<input type="text" name="field_nome" value="padrao" /> <br />
		<input type="date" name="field_data" /> <br />
		
		<select name="field_idioma" id="">
			
			<option value="ingles">Inglês</option>
			<option value="espanhol">Espanhol</option>
			<option value="portugues">Português</option>
			
		</select> 
		
		<br />
		
		<span>
			<input type="checkbox" name="habilidades" value="java"> Java 
		</span>
		
		<span>
			<input type="checkbox" name="habilidades" value="js"> JavaScript 
		</span>
		
		<span>
			<input type="checkbox" name="habilidades" value="html"> HTML 
		</span>
		
		<span>
			<input type="checkbox" name="habilidades" value="css"> CSS 
		</span>
		
		<input type="submit" value="enviar" />
		
	</form>

</body>
</html>