package com.jdc.mkt;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/redirectTo")
public class RedirectToServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	@SuppressWarnings(value = "unchecked")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//	List<String> list = (List<String>) req.getAttribute("StringList");
		String tst = (String) req.getAttribute("test");
		
		resp.getWriter().append("<ul>")

				.append("<li>")

				.append("List size :" +tst)
				.append("</li>")
				.append("</ul>").flush();
	}

}
