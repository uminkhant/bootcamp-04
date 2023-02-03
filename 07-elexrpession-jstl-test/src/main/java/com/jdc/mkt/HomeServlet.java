package com.jdc.mkt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private List<Person>list = new ArrayList<>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Person p = new Person();
		p.setName(req.getParameter("name"));
		p.setAge(Integer.parseInt(req.getParameter("age")));
		
		list.add(p);
		
		req.setAttribute("persons", list);
		req.getRequestDispatcher("home.jsp").forward(req, resp);
		
	}

}
