package com.amazon.user;

public class StaticInitBlock {

  static int number;     //static variable
 
  
  static {  //static block Belongs to the class
	        //this will execute just after loading the class
			//it will execute before main method 
			//execute only once before object is being created
			//Its main purpose is to initialize static variables or perform one-time setup for the class.
	  number = 100;
	  System.out.println("number...initialized");
	  
  }
  public static void main(String[] args) {
	  System.out.println(number);
	  
}
}
