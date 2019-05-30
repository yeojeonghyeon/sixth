package com.scggi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormTestServlet
 */
@WebServlet("/FormTestServlet")
public class FormTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String userAge = request.getParameter("userAge");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.append("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"utf-8\">\r\n" + 
				"<title>form test</title>\r\n" + 
				"<style>\r\n" + 
				".grid-container {\r\n" + 
				"	width: 60%;\r\n" + 
				"	display: grid;\r\n" + 
				"	grid-template-columns: 30% 70%\r\n" + 
				"	background-image: linear-gradient(to bottom right, #95a1b3, #1b6953, #808217);\r\n" + 
				"	padding: 5px;\r\n" + 
				"}\r\n" + 
				".grid-item {\r\n" + 
				"	background-color: rgba(255, 255, 255, 0.9);\r\n" + 
				"	border: 0.2px solid rgba(0, 0, 0, 0.8);\r\n" + 
				"	padding: 10px;\r\n" + 
				"	font-size: 1em;\r\n" + 
				"	text-align: left;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<header>\r\n" + 
				"		<h3>폼 전송 결과</h3>\r\n" + 
				"	</header>\r\n" + 
				"	<nav>\r\n" + 
				"	</nav>\r\n" + 
				"	<section>\r\n" + 
				"		<article>\r\n" + 
				"				<div class=\"grid-container\">\r\n" + 
				"					<div class=\"grid-item\"><span>이름:&nbsp;</span></div>\r\n" + 
				"					<div class=\"grid-item\"><input type=\"text\" name=\"userName\" placeholder=\"이름을 입력하세요!\"></div>\r\n" + 
				"					<div class=\"grid-item\"><span>나이:&nbsp;</span></div>\r\n" + 
				"					<div class=\"grid-item\"><input type=\"text\" name=\"userAge\" value="+userAge+"></div>\r\n" + 
				"				</div>\r\n" + 
				"		</article>\r\n" + 
				"	</section>\r\n" + 
				"	<footer>\r\n" + 
				"	</footer>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
