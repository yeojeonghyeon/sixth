package com.scggi.servlet;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scggi.servlet.temp.Student;

/**
 * Servlet implementation class CollectionServlet
 */
@WebServlet("/CollectionServlet")
public class CollectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollectionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", "남", "죽창 던지기");
		students[1] = new Student("이영희", "여", "복싱");
		students[2] = new Student("최순실", "여", "국정농단");
		
		Stream<Student> stream = Stream.of(new Student("john", "male", "extreme"), new Student("anna", "female", "swimming"));
		List<Student> list = stream.collect(Collectors.toList());
		
		request.setAttribute("students", students);
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("./jsp/collection.jsp");
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
