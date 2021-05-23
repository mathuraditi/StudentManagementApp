package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao 
{
     public static boolean insertStudentToDB(Student student_object)
     {
    	 boolean flag = false;
    	 //jdbc code....
    	 try
    	 {
    		 Connection connection = ConnectionProvider.createConnection(); 
    		 String insertQuery = "insert into students (stud_name,stud_phone,stud_mailid)" + " values (?,?,?)";
    		 
    		 //PreparedStatement
    		 PreparedStatement statement = connection.prepareStatement(insertQuery);
    		 
    		 //set value of parameters
    		 statement.setString(1, student_object.getStudentName());
    		 statement.setString(2, student_object.getStudentPhone());
    		 statement.setString(3, student_object.getStudentMailId());
    		 
    		 //execute query....
    		 statement.executeUpdate();
    		 flag = true;
    	 }
    	 
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    		// e.getMessage();
    	 }
    	 return flag;
     }

	public static boolean deleteStudent(int studId) {
		boolean flag = false;
		
		//jdbc code.....
		try
		{
			Connection connection = ConnectionProvider.createConnection();
			String deleteQuery = "delete from students where stud_id = ?";
			
			//PreparedStatement
			PreparedStatement statement = connection.prepareStatement(deleteQuery);
			
			//set the value of parameter
			statement.setInt(1, studId);
			
			//execute query.....
			statement.executeUpdate();
			flag = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}

	public static void showAllStudents() 
	{
		
		try 
		{
			Connection connection = ConnectionProvider.createConnection();
			String displayQuery = "select *from students";
			
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery(displayQuery);
			
			while(result.next())
			{
				int id = result.getInt(1);
				String name = result.getString(2);
				String phone = result.getString(3);
				String mail = result.getString(4);
				
				System.out.println("Student Id: " + id);
				System.out.println("Student Name: " + name);
				System.out.println("Student Phone: " + phone);
				System.out.println("Student MailId: " + mail);
				System.out.println("......................................");
			}	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	
	public static boolean updateStudent(int studId,String studPhone) 
	{
		boolean flag = false;
		
		try
		{
			//jdbc code...
			Connection connection = ConnectionProvider.createConnection();
			String updateQuery = "update students set stud_phone = ? where stud_id = ?";
			
			//prepared statement
			PreparedStatement statement = connection.prepareStatement(updateQuery);
			
			//sets values of parameters
			statement.setString(1,studPhone);
			statement.setInt(2, studId);
			
			//execute query....
			statement.executeUpdate();
			flag = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
		
	}
	
}
