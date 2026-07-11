package com.practice.constructor;

public class ProductCat 
      {                 //just to see how constructor chaining reduce redundancy 
        String name;
        int price;
        String category;
        
        
        //1st constructor
        ProductCat()
        {
        	this("kruwe",23);
        	
        }
        ProductCat( String name, int price)
        {
        	
        	this.name = name;
        	this.price = price;
        	
        	
        	
        }
        
     
      //2rd constructor
        ProductCat(String nameA, int priceB, String categoryA)
        { 
        	this(nameA,priceB);
        	this.category = categoryA; 
            
        }
        void connect() {
        	
        	System.out.println(name);
        	System.out.println(price);
        	System.out.println(category);
        	System.out.println();
        	
        }
        
        public static void main(String args[])
        {
        	
        	
        ProductCat p1 = new ProductCat();
        ProductCat p2 = new ProductCat("parleG",100,"biscuit");
          
                  p1.connect();
                  p2.connect();        
        }

	 
} 
