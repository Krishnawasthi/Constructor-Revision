package com.amazon.user;

 public class instanceInitBlock {
	private String userId;
	 //Any Prerequisites for Objects  we will write into IIB(instance Init block) block
	{
		System.out.println("instance  init block................");    //IIB (instance initialization block
		                                                               //Any Prerequisites for objects we will write into instance init block
		                                                               //it will execute or print values for each object 
	}
	instanceInitBlock(String _userId){
		super(); // this is the 1st line of constructor
		 //2nd line will be the IIB line
		this.userId = _userId; 
		
		System.out.println("constructor");
	}
	
     public static void main(String[] args) {
		
//		System.out.println("method......main(0)");
	  
		instanceInitBlock u1 = new instanceInitBlock("ktishna242_lkfnsfsfn");
		instanceInitBlock u2 = new instanceInitBlock("shfgshfshflshl");

	}
}
