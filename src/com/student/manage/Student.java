package com.student.manage;

public class Student {
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String studentMailId;
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public String getStudentPhone()
	{
		return studentPhone;
	}
	
	public void setStudentPhone(String studentPhone)
	{
		this.studentPhone = studentPhone;
	}
	
	public String getStudentMailId()
	{
		return studentMailId;
	}
	
	public void setStudentMailId(String studentMailId)
	{
		this.studentMailId = studentMailId;
	}
	
	public Student(int studentId,String studentName,String studentPhone, String studentMailId)
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentMailId = studentMailId;
	}
	
	public Student(String studentName,String studentPhone, String studentMailId)
	{
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentMailId = studentMailId;
	}
	
	public Student()
	{
		super();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentMailId=" + studentMailId + "]";
	}
	
	

}
