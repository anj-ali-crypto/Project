package com.sbpdcl.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import com.sbpdcl.bean.Student;
import com.sbpdcl.services.StudentService;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentController() {
        super();
         }
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String name = request.getParameter("name");
		String roll = request.getParameter("roll");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		
		Student student=new Student();
		student.setName(name);
		student.setRoll(roll);
		student.setEmail(email);
		student.setPassword(password);
		student.setGender(gender);
		student.setDob(dob);
		
	 
		System.out.println(student);
		
		StudentService service=new StudentService();
		
		service.registerStudent(student);
		
		
		
		
	}

}
