package com.scggi.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FavoriteFood
 */
@WebServlet("/FavoriteFood")
public class FavoriteFood extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FavoriteFood() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> spring = Arrays.asList("새싹비빔밥","도다리 쑥국","새조개 샤브샤브","진달래 경단");
		List<String> summer = Arrays.asList("팥빙수","냉면","수박","농어");
		List<String> fall = Arrays.asList("전어구이","낚지비빔밥","감성돔 회","키조개 샤브샤브");
		List<String> winter = Arrays.asList("고구마 구이","호빵","붕어빵","딸기");
		
		request.setAttribute("spring", spring);
		request.setAttribute("summer", summer);
		request.setAttribute("fall", fall);
		request.setAttribute("winter", winter);
		
		RequestDispatcher rd = request.getRequestDispatcher("jsp/menu.jsp");
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
