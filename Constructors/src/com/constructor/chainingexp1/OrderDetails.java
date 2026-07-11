package com.constructor.chainingexp1;

public class OrderDetails extends Order {
	
	 String address;
	
	 OrderDetails(int amount, String name, String empId, String address){
		
		super(amount,name, empId);
		this.address = address;
	}
	
	

}
