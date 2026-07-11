package com.student.user;
public class Parent  {
    
	static String collegeName;
	
	
	String name;
    int age;
  
	
	static {
		
		System.out.println("Loading person class.....");    // SIB 1
	}
	
	static {
		
		collegeName = "GCET";
		System.out.println("College details loaded for all the class");  //SIB2
	}
	
	{
		System.out.println("Person object creation started");    //IIB1
	}
	
	{
		System.out.println("Basic person info initialized");      //IIB2
	}
	
	//constructor to initialize objects
	
	Parent(){
		
		
		
	}
    Parent(String _name ){
		
		 this(_name, 17);
	}
    
    Parent(String __name, int _age ){
		
    	this.name = __name;
    	this.age = _age;
		
	}
    
  
	
	
	
}
