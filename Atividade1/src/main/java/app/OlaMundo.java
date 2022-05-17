package app;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/olamundo")
public class OlaMundo extends HttpServlet {
	
	private static final long serialVersionUID = -269015502780344134L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Hello World");
		
		PrintWriter print = resp.getWriter();
		
		print.print("Hello World");
	}

}
