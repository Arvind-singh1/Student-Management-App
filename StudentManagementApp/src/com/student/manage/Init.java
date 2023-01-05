package com.student.manage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Init {
	public static void main(String[] args) throws IOException{
		System.out.println("Welcome to Student Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 to ADD Student: ");
			System.out.println("PRESS 2 to Delete Student: ");
			System.out.println("Press 3 to Display Student: ");
			System.out.println("Press 4 to Update...");
			System.out.println("PRESS 5 to Exit:");
			
			int c= Integer.parseInt(br.readLine());
			
		
		if(c==1) {
			//to Add
			System.out.println("Enter User Name: ");
			String name=br.readLine();
			System.out.println("Enter User Phone:");
			String phone=br.readLine();
			System.out.println("Enter User City:");
			String city=br.readLine();
			Student st=new Student(name,phone,city);
			boolean answer=StudentDao.insertToDB(st);
			if(answer) {
				System.out.println("Student Successfully Added..");
			}else {
				System.out.println("Something went Wrong, Try Again..");
			
			}
			System.out.println(st);
		}
		else if(c==2) {
			// to delete
			System.out.println("Enter Student ID to Delete: ");
			int userId=Integer.parseInt(br.readLine());
			boolean f=StudentDao.deleteStudent(userId);
			if(f) {
				System.out.println("Deleted..");
			}else {
				System.out.println("Something went Wrong, Try Again..");
			}
		}
		else if(c==3) {
			// to display
			StudentDao.showallStudent();
		}
		else if(c==4) {
			// to update
			boolean f=StudentDao.updateStudent();
			if(f) {
				System.out.println("Data Updated..");
			}else {
				System.out.println("Something went Wrong, Try Again..");
			}
		}
		else if(c==5){
			// to exit
			break;
		}
		else {
		}
		}
		System.out.println("Thanks for using My Application..");
		System.out.println("See you Again....");
	}

}
