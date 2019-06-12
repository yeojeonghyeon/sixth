package com.scggi.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scggi.servlet.temp.Person;

/**
 * Servlet implementation class HundredServlet
 */
@WebServlet("/HundredServlet2")
public class HundredServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HundredServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i=0; i<101; i++) {
			total+=i;
		}
		
		Map<String, Person> map = new HashMap<String, Person>();
		
		Person p = new Person("철수", 38);
		
		map.put("person", p);
		request.setAttribute("person", p);
		request.setAttribute("map", map);
		request.setAttribute("result", total);
		RequestDispatcher rd = request.getRequestDispatcher("jsp/hundred.jsp");
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
