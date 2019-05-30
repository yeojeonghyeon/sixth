package com.scggi.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetrieveServlet
 */
@WebServlet("/RetrieveServlet")
public class RetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rKind = request.getParameter("rKind");
		List<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();

		switch(rKind) {
		case "subject":
			HashMap<String, String> s = new HashMap<String, String>();
			s.put("subject", "국어");
			result.add(s);
			s = new HashMap<String, String>();
			s.put("subject", "영어");
			result.add(s);
			break;
		case "user":
			HashMap<String, String> u = new HashMap<String, String>();
			u.put("user", "김영희");
			result.add(u);
			u = new HashMap<String, String>();
			u.put("user", "박철수");
			result.add(u);
			break;			
		}
		request.setAttribute("rKind", rKind);
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("jsp/retrieveList.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
