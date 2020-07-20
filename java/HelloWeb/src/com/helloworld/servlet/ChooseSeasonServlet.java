package com.helloworld.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChooseSeasonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ChooseSeasonServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result = request.getParameter("result");
		StringTokenizer st = new StringTokenizer(result, ":");
		List<FoodForSeason> list = new ArrayList<>();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "hong gil dong");
		map.put("age", "1555");
		
		while(st.hasMoreTokens()) {
			list.add(new FoodForSeason(st.nextToken()));
		}
		request.setAttribute("result", list);
		
		request.setAttribute("info", map);
		
		RequestDispatcher rd = request.getRequestDispatcher("./jsp/ChooseSeason.jsp");
		rd.forward(request,  response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
