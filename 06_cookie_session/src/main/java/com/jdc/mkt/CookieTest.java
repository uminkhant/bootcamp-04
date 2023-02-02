package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/cookieTest")
public class CookieTest extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User u = new User();
		u.setId(1);
		u.setName(req.getParameter("user"));		
		u.setAge(convertToInt( req.getParameter("age")));
		
		Cookie ck = new Cookie("greeting", "Hello java");
		ck.setMaxAge(30);
		
		ck.setAttribute("user",u.getName() );
		ck.setAttribute("age", u.getAge()+"");
		
		req.getRequestDispatcher("/home").forward(req, resp);
		
		var sess = req.getSession();
		sess.invalidate();
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
	}
	
	private int convertToInt(String param) {
		return param == null  ? 0 : Integer.parseInt(param);
	}

}
