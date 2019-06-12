package com.scggi.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.scggi.servlet.temp.MenuItem;

/**
 * Servlet implementation class ChainedServlet
 */
@WebServlet("/ChainedServlet")
public class ChainedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChainedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<MenuItem> list = new ArrayList<MenuItem>();
		Gson gson = new Gson();
		list.add(new MenuItem("1000", "", "전라남도"));		
		list.add(new MenuItem("2000", "", "전라북도"));
		list.add(new MenuItem("1001", "1000", "여수시"));
		list.add(new MenuItem("1002", "1000", "순천시"));
		list.add(new MenuItem("2001", "2000", "정읍시"));
		list.add(new MenuItem("2101", "2001", "삼례"));
		list.add(new MenuItem("2002", "2000", "전주시"));
		list.add(new MenuItem("1101", "1001", "소호동"));
		list.add(new MenuItem("11011", "1101", "소호동 1길"));
		list.add(new MenuItem("1102", "1001", "종화동"));
		list.add(new MenuItem("1201", "1002", "조례동"));
		list.add(new MenuItem("1202", "1002", "연향동"));
		list.add(new MenuItem("1211", "1202", "연향 1길"));
		list.add(new MenuItem("1212", "1202", "연향 2길"));
		response.setContentType("plain/text;charset=utf-8");
		response.getWriter().append(gson.toJson(list));		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
