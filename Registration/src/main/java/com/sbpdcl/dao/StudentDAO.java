package com.sbpdcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.sbpdcl.bean.Student;
import com.sbpdcl.util.DBconnection;

 public class StudentDAO {

	public boolean registerStudent(Student student1)
	{
		try {
			Connection con=DBconnection.createConnection();
			PreparedStatement ps= con.prepareStatement("Insert into student(name,roll,email,password,gender,dob)values(?,?,?,?,?,?)");
			
			ps.setString(1, student1.getName());
			ps.setString(2,student1.getRoll());
			ps.setString(3,student1.getEmail());
			ps.setString(4,student1.getPassword());
			ps.setString(5, student1.getGender());
			ps.setDate(6, java.sql.Date.valueOf(student1.getDob()));
			
			return ps.executeUpdate()>0;
			//System.out.println("Data Inserted Successfully");
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		}
	
	public boolean isValidUser(String email,String password)
	{
		try {
			Connection con=DBconnection.createConnection();
			PreparedStatement ps= con.prepareStatement("Select * from student where email=? and password=?");
			
			ps.setString(1, email);
			ps.setString(2,password);
			
			
		ResultSet rs =  ps.executeQuery();	
		return rs.next();
			//System.out.println("Data Inserted Successfully");
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
