package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("field-email");
		String senha = req.getParameter("field-senha");
		
		
		Usuario usu = verificaLogin(email, senha);
		
		if (usu != null) {
			
			HttpSession sessao = req.getSession(true);
			
			sessao.setAttribute("usuario", usu);
			sessao.setAttribute("esta_logado", true);
			
			resp.sendRedirect("index.jsp");

			
		} else {
			
			//o login falhou
			resp.sendRedirect("login.jsp");
			
		}
	}
	
	public Usuario verificaLogin(String email, String senha) {
		
		Usuario usu1 = new Usuario("jefferson@ifpr.edu.br", "senha_ifpr");
		Usuario usu2 = new Usuario("romildo@ifpr.edu.br", "senha_romildo");
		Usuario usu3 = new Usuario("thais@ifpr.edu.br", "senha_thais");
		
		List<Usuario> bancoDados = new ArrayList<>();
		bancoDados.add(usu1);
		bancoDados.add(usu2);
		bancoDados.add(usu3);
		
		Usuario usuarioLogin = new Usuario(email, senha);

		if(bancoDados.contains(usuarioLogin)) {
			return usuarioLogin;
		}else {
			return null;
		}

	}
	
	
}
