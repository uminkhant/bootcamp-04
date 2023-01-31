package com.jdc.mkt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/redirect")
public class RedirectServlet extends HttpServlet{
	
	

	private static final long serialVersionUID = 1L;
	
	private List<String> list;
	
	@Override
	public void init() throws ServletException {
		list = new ArrayList<>();
		
		list = Arrays.asList("Ko Ko","William","John");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("StringList", list);
		req.setAttribute("test", "ssssfasdfads");
		
		resp.sendRedirect(getServletContext()
				.getContextPath().concat("/redirectTo"));
	}

	
}
