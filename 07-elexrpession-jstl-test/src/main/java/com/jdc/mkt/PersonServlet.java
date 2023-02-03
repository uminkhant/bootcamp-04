package com.jdc.mkt;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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
		List<String> list = Arrays.asList("myo thu","kyaw kyi","wanna");
		Person p = new Person();
		p.setId(1);
		p.setName(list.get(0));
		p = null;
		req.setAttribute("person", p);
		
		
		switch(req.getServletPath()) {
		
		case "/person":
			req.getRequestDispatcher("person.jsp").forward(req, resp);
			break;
			
		case "/jstlTest":
			req.setAttribute("nameList", list);
			req.getRequestDispatcher("jstlTest.jsp").forward(req, resp);
			break;
		}
		
	}
}










