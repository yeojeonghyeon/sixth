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
import com.scggi.servlet.temp.Animal;
import com.scggi.servlet.temp.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sendType = request.getParameter("sendType");
		String jsonStr;
		if (sendType.equals("a")) {
			List<Student> list = new ArrayList<Student>();
			Gson gson = new Gson();
			list.add(new Student("jonadan", "남성", "스카이 다이빙"));
			list.add(new Student("john", "남성", "독서"));
			list.add(new Student("lancy", "여성", "extreme sports"));
			jsonStr = gson.toJson(list);
		}else {
			List<Animal> list = new ArrayList<Animal>();
			Gson gson = new Gson();
			list.add(new Animal("토끼", "산", 50));
			list.add(new Animal("달팽이", "산", 100));
			list.add(new Animal("상어", "바다", 25));
			jsonStr = gson.toJson(list);
		}
		response.setContentType("plain/text;charset=utf-8");
		response.getWriter().append(jsonStr);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
