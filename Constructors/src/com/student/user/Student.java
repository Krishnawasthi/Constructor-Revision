package com.student.user;   //project to understand constructor chaining, IIB, SIB, SUPER, THIS methods

public class Student extends Parent {
	
	String studentId;
	  String course;
	
	static int totalStudents;
	
	static {
		
		System.out.println("Loading student class...........");  //SIB 1
	}
	
	static {
		
		totalStudents = 30000;
		System.out.println("Student management ready");  //SIB 2
		
	}
	
	
	{
		  
		
		
		totalStudents++;
		                            //IIB 1
		studentId = "ST" + totalStudents;
	
		
		
	}
	
	{
		
		
		System.out.println("Student Id successfully generated");  //IIB 2
		
	}
	
	
	
	//creating constructor for student class
	
	Student(){
		
          this( "krihsna" ,"mca");
		
		
	}
	
	Student(String name, String course){
		
		super(name);
		this.course = course;
		
		
	}
	
	Student(String name, int age, String course){
		
		super(name , age);
		this.course = course;
	}
	
	
	
	 void displayStudent() {
		 
		 System.out.println("Student name   : " + name);
		 System.out.println("Student age    : " + age);
		 System.out.println("Student ID     : " + studentId);
	    System.out.println("Course          : " + course);
		 
		 
		 
	 }
		
	
	
	
	
}
