package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		var cks  = req.getCookies();
		
		for(var ck : cks) {
			System.out.println(ck.getDomain());
			System.out.println(ck.getName());
		
		}
		
		
		
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}

}
