package com.amazon.user;

public class CountNumberOfObj {  //count number of objects created from the system
	  //like you want to see the live watching of hot Star cricket live 
	  static int count;
	 private String name;
	   
	 {
		 count++;          //this is an IIB block for all the objects
	 }
	 
	   CountNumberOfObj(){
		   
		 
		 
	   }
	   CountNumberOfObj(String _name){
		     this.name = _name;
			 
			  
		   }
	
	

	public static void main(String[] args) {
		CountNumberOfObj u5 = new CountNumberOfObj();
		CountNumberOfObj u7 = new CountNumberOfObj();
		CountNumberOfObj u8 = new CountNumberOfObj();
		CountNumberOfObj ud = new CountNumberOfObj("krish");
		CountNumberOfObj ua = new CountNumberOfObj("gkbgdih");
		CountNumberOfObj uj = new CountNumberOfObj("fsfish");
		CountNumberOfObj us = new CountNumberOfObj("suifhfgh");
		CountNumberOfObj ul = new CountNumberOfObj("jsdifsfi");
		CountNumberOfObj um = new CountNumberOfObj("fjbsfiF");
		
		
		 System.out.println(CountNumberOfObj.count);
		 
     
	}

}
