package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cabecalhos")
public class CabecalhoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String host = req.getHeader("host");
		String agent = req.getHeader("user-agent");
		String encoding = req.getHeader("aceppt-encoding");
		String language = req.getHeader("accept-language");
		
		PrintWriter out = resp.getWriter();

		out.print("<html language=\"pt-br\"><body>");
		
		out.print("host: " + host + "<br/>");
		out.print("agent: " + agent + "<br/>");
		out.print("encoding: " + encoding+ "<br/>");
		out.print("language: " + language+ "<br/>");

		out.print("</body></html>");


		
	}
	
}
