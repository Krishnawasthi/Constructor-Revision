package com.constructor.chainingexp1;

public class Order extends Object {
	
     int amount;
     String name;
     String empId;

       
       Order(int amount1,String name)
       
       {
       	  this.amount = amount1; 
       	  this.name = name;
    	  
    	  
    	   
       }
       
       Order(int amount, String name, String empid){
    	   
           this(amount,name);
    	   this.empId = empid;
    	   
    	   
    	      
       }
       
       public static void main(String args[])
       {  
    	   
           Order o1 = new Order(200,"krish"); 
   	       Order o2 = new Order(300,"krishna","lala112321");
   	       
    	  OrderDetails o3 = new OrderDetails(300,"krishna","lala112321","45cross bengaluru"); 
    	  System.out.println(o3.amount);
          System.out.println(o3.name);
          System.out.println(o3.empId);
          System.out.println(o3.address);
    	  
       }    
	
}
