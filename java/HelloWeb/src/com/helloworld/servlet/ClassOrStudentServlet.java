package com.helloworld.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClassOrStudentServlet
 */
public class ClassOrStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassOrStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String classOrStudent = request.getParameter("classOrStudent");
		List<String> list = new ArrayList<String>();
		if ( classOrStudent.equals("class") ) {
			list = Arrays.asList("국어", "수학", "영어", "공업수학", "이산수학", "철학");
		}else if( classOrStudent.equals("student")) {
			list = Arrays.asList("김선국", "김선길", "김영훈", "김재현", "손정우", "심병화");
		}
		request.setAttribute("result", list);
		RequestDispatcher rd = request.getRequestDispatcher("chooseClassOrStudent.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
