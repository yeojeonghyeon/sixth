package com.scggi.servlet;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FibonacciServlet
 */
//@WebServlet("/FibonacciServlet")
public class FibonacciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BigInteger[] arr;
	@Override
	public void init() throws ServletException {
		ServletConfig sc = getServletConfig();
		String limitStr = sc.getInitParameter("limit");
		int limit = limitStr!=null?Integer.parseInt(limitStr):100;
		arr = new BigInteger[limit];
		arr[0] = new BigInteger("1");
		arr[1] = new BigInteger("1");
		for(int i=2; i<limit; i++) {
			arr[i] = arr[i-2].add(arr[i-1]);
		}
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FibonacciServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("arr", arr);
		RequestDispatcher rd = request.getRequestDispatcher("./jsp/fibo.jsp");
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
