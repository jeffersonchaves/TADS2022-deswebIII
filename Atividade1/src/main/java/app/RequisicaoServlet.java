package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requisicao")
public class RequisicaoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String metodo   = req.getMethod();
		String URI      = req.getRequestURI();
		String protocol = req.getProtocol();
		
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html language=\"pt-br\"><body>");
		
		out.print("metodo: " + metodo + "<br/>");
		out.print("URI: " + URI + "<br/>");
		out.print("protocol: " + protocol);
		
		out.print("</body></html>");
		
	}
	
}
