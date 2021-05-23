import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException
	{
		
     System.out.println("Welcome To Student Management App");
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     while(true)
     {
    	 System.out.println("Press 1 to Add Student");
    	 System.out.println("Press 2 to Delete Student");
    	 System.out.println("Press 3 to Display All Student");
    	 System.out.println("Press 4 to Update Student Information");
    	 System.out.println("Press 5 to Exit App");
    	 
    	 int user_choice = Integer.parseInt(br.readLine());
    	 
    	 if(user_choice == 1)
    	 {
    		 //add student
    		 System.out.println("Enter Student Name : ");
    		 String student_name = br.readLine();
    		 
    		 System.out.println("Enter Student Phone : ");
    		 String student_phone = br.readLine();
    		 
    		 System.out.println("Enter Student MailId : ");
    		 String student_mailId = br.readLine();
    		 
    		 //create student object to store student
    		 Student student_object = new Student(student_name,student_phone,student_mailId);
    		 
    		 boolean result = StudentDao.insertStudentToDB(student_object);
    		 if(result) 
    		 {
    			 System.out.println("Student is added successfully....");
    		 }
    		 else
    		 {
    			 System.out.println("Something went wrong try again....");
    		 }
    		 
    		 System.out.println(student_object);
    	 }
    	 else if(user_choice == 2)
    	 {
    		 //delete student
    		 System.out.println("Enter student id to delete:");
    		 int studId = Integer.parseInt(br.readLine());
    		boolean result = StudentDao.deleteStudent(studId);
    		
    		if(result)
    		{
    			System.out.println("Student deleted");
    		}
    		else
    		{
    			System.out.println("Something went wrong try again.....");
    		}
    	 }
    	 else if(user_choice == 3)
    	 {
    		 //display student
    		 StudentDao.showAllStudents();
    	 }
    	 else if(user_choice == 4)
    	 {
    		 //update student
    		 System.out.println("Enter Student Id to Update: ");
    		 int studId = Integer.parseInt(br.readLine());
    		 
    		 System.out.println("Enter new phone number: ");
    		 String studPhone = br.readLine();
    		 
    		 boolean result = StudentDao.updateStudent(studId,studPhone);
    		 if(result)
    		 {
    			 System.out.println("Student Phone Number Updated!!!!");
    		 }
    		 else
    		 {
    			 System.out.println("Something went wrong try again....");
    		 }
    	 }
    	 else if(user_choice == 5)
    	 {
    		 //exit
    		 break;
    	 }
    	 else
    	 {
    		 
    	 }
     }
         System.out.println("Thank You for Using My Application");
         System.out.println("See You Soon....");
	}

}
