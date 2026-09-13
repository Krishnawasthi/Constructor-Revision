package com.amazon.user1;

public class Driver extends Object {

	public static void main(String[] args) {
	   String a = "25";
	   String b = "25";
	   
	   
	   String c  = new String("56");
	   String d  = new String("56");
	   
	   System.out.println(a==b); //checking reference
	   System.out.println(a.hashCode());
	   System.out.println(b.hashCode());
	   
	   System.out.println("------------------------------------------");
	  
	   System.out.println(c.hashCode());
	   System.out.println(d.hashCode());
	   System.out.println(c.equals(d));
	   
	   
	   

	}

}
