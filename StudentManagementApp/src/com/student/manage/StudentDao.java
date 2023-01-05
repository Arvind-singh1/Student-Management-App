package com.student.manage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.Statement;


import java.sql.ResultSet;

public class StudentDao {
	public static boolean insertToDB(Student st) {
		boolean f=false;
		try {
			Connection con=ConnectionProvider.getConnection();
			String q="insert into student_manage(name,phone,city) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2,st.getStudentPhone());
			pstmt.setString(3,st.getStudentCity());
			
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return f;
		
	}

	public static boolean deleteStudent(int userId) {
		boolean f=false;
		try {
			Connection con=ConnectionProvider.getConnection();
			String q="delete from student_manage where id=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1,userId);

			
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return f;
		
	
		
	}

	public static void showallStudent() {
		boolean f=false;
		try {
			Connection con=ConnectionProvider.getConnection();
			String q="select * from student_manage ";
			Statement stmt= con.createStatement();
			ResultSet set=  stmt.executeQuery(q);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString("city");
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+phone);
				System.out.println("City : "+city);
				System.out.println("+++++++++++++++++++++++++");
				
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		  
		}
	}

	public static boolean updateStudent() {
		boolean f=false;
		try {
			Connection con=ConnectionProvider.getConnection();
			 String q="update student_manage set name=?, phone=?,city=? where id=?";
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("Enter new name:");
			 String name=br.readLine();
			 System.out.println("Enter new Phone:");
			 String phone=br.readLine();
			 System.out.println("Enter new City name:");
			 String city=br.readLine();
			 System.out.println("Enter Student id: ");
			 int id=Integer.parseInt(br.readLine());
			 PreparedStatement pstmt=con.prepareStatement(q);
			 pstmt.setString(1, name);
			 pstmt.setString(2, phone);
			 pstmt.setString(3,city);
			 pstmt.setInt(4, id);
			 pstmt.executeUpdate();
			 f=true;
			 System.out.println("success..");
			 
			 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

}
		
	


