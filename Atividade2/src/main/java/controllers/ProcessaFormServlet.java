package controllers;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Cadastro;

@WebServlet("/processa")
public class ProcessaFormServlet  extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String nome = req.getParameter("field_nome");
		String dataStr = req.getParameter("field_data");
		String idioma = req.getParameter("field_idioma");
		
		String[] habilidades = req.getParameterValues("habilidades");
				
		try {
		
			Cadastro cadastro = new Cadastro();
			
			cadastro.setNome(nome);
			cadastro.setDataNascimento(dataStr);
			cadastro.setIdioma(idioma);
			cadastro.setHabilidades(habilidades);
		
		} catch (Exception e) {
			
			req.setAttribute("erro", e.getMessage());
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("formulario.jsp");
			dispatcher.forward(req, resp);
						
		}
		

		/*
		resp.getWriter().println("nome: " + nome);
		resp.getWriter().println("data: " + formatador.format(data));
		resp.getWriter().println("idioma: " + idioma);
		
		for (int i = 0; i < habilidades.length; i++) {
			resp.getWriter().println(habilidades[i]);
		}

		*/
		
		
	}

}
