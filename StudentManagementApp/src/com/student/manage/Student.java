package com.student.manage;

public class Student {
	private int StudentID;
	private String StudentName;
	private String StudentPhone;
	private String StudentCity;
	
	
	public int getStudentID() {
		return StudentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public String getStudentPhone() {
		return StudentPhone;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	public Student(int studentID, String studentName, String studentPhone, String studentCity) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
	}
	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
				+ ", StudentCity=" + StudentCity + "]";
	}
	
	
	
	

}
