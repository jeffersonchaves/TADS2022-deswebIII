package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class UsersServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<String> usuarios = new ArrayList<String>();
		usuarios.add("Maurício");
		usuarios.add("Lara");
		usuarios.add("Patrick");
		usuarios.add("Allan");
		usuarios.add("Jefferson");

		
		req.setAttribute("usuarios", usuarios);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("listaUsuarios.jsp");
		dispatcher.forward(req, resp);
		
	}

}
