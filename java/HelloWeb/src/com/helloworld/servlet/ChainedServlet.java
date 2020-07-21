package com.helloworld.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.helloworld.vo.MenuItem;

public class ChainedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ChainedServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String menuType = request.getParameter("menuType");
		List<MenuItem> list = new ArrayList<MenuItem>();
		if ( menuType.equals("address") ) {
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
		}else {
			list.add(new MenuItem("1000", "", "커피"));	
			list.add(new MenuItem("1100", "1000", "원두커피"));				
			list.add(new MenuItem("1200", "1000", "인스턴트커피"));				
			list.add(new MenuItem("1101", "1200", "맥심"));			
			list.add(new MenuItem("1102", "1200", "카누"));			
			list.add(new MenuItem("2000", "", "음료"));
		}
		Gson gson = new Gson();
		response.setContentType("plain/text;charset=utf-8");
		response.getWriter().append(gson.toJson(list));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
