package com.helloworld.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstStepServlet
 */
public class SecondStepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SecondStepServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String favoriteFood = request.getParameter("favoriteFood");
		String favoriteSport = request.getParameter("favoriteSport");
		session.setAttribute("favoriteFood", favoriteFood);
		session.setAttribute("favoriteSport", favoriteSport);
		RequestDispatcher rd = request.getRequestDispatcher("./cookieAndSession/secondStep.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
