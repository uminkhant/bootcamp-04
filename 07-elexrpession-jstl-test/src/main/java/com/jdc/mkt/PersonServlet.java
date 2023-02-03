package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/person","/jstlTest"})
public class PersonServlet  extends HttpServlet{

	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("name", "Htet naing soe");
		
		switch(req.getServletPath()) {
		case "/person":
			req.getRequestDispatcher("person.jsp").forward(req, resp);
			break;
		case "/jstlTest":
			req.getRequestDispatcher("jstlTest.jsp").forward(req, resp);
			break;
		}
		
	}
}
