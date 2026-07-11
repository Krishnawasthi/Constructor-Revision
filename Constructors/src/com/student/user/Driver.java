package com.student.user;

public class Driver {
public static void main(String[] args) {
	
	System.out.println("main () working............");
	Student s1 = new Student();

	System.out.println();

	Student s2 = new Student("Krishna",27,"MCA");

	System.out.println();

	Student s3 = new Student("Rahul",22,"BCA");
	Student s4 = new Student("mohan",24,"BTECH");
	
	s1.displayStudent();
	System.out.println();
    s2.displayStudent();
    System.out.println();
    s3.displayStudent();
    System.out.println();
    s4.displayStudent();
}
}
