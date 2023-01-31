package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sendValue")
public class CounterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Counter c1 = (Counter) req.getAttribute("counter");
				
		if(null == c1) {
			c1 = new Counter();
			req.setAttribute("counter", c1);
			
		}
		c1.countUp();
		
		var session = req.getSession(true);	
		Counter c2 = (Counter) session.getAttribute("counter");
		
		if( null == c2) {
			c2 = new Counter();
			session.setAttribute("counter", c2);
		}
		c2.countUp();
		
		var context = getServletContext();
		Counter c3 = (Counter) context.getAttribute("counter");
		
		if( null == c3) {
			c3 = new Counter();
			context.setAttribute("counter", c3);
		}
		c3.countUp();
		
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}

}
