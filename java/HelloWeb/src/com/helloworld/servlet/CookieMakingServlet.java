package com.helloworld.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieMakingServlet
 */
public class CookieMakingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CookieMakingServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String food = request.getParameter("favoriteFood");
		String sport = request.getParameter("favoriteSport");
		System.out.println(food);
//		response.setContentType("text/html;charset=UTF-8");
//		response.setCharacterEncoding("UTF-8");
		response.addCookie(new Cookie("favoriteFood", food));
		response.addCookie(new Cookie("favoriteSport", sport));
//		response.addCookie(new Cookie("favoriteSport", sport));
		RequestDispatcher rd = request.getRequestDispatcher("./cookieAndSession/cookie.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
