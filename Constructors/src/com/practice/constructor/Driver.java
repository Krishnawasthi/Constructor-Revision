package com.practice.constructor;


class Product{
	String prodName;
	int prodPrice;
	static int prodGst = 18;
	
	public Product(String prodName, int prodPrice) {
		
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	
	int totalprodPrice = 0;
	public int Calgst() {
		
		return totalprodPrice = prodPrice+ prodPrice*18/100;
		
	}
	
}
public class Driver {

	public static void main(String[] args) {
		
		Product p1 = new Product("Samsung", 12000);
		Product p2 = new Product("Apple", 15000);
		Product p3 = new Product("Nokia", 20000);
		Product p4  = new Product("Redemi",25000);
		
		System.out.println("Product name: "+p1.prodName+" ProdcutPirce: "+p1.prodPrice+" Price after " + Product.prodGst +"% of Gst: "+ p1.Calgst());
		System.out.println("Product name: "+p2.prodName+" ProdcutPirce: "+p2.prodPrice+" Price after 18% of Gst: "+ p2.Calgst());
		System.out.println("Product name: "+p3.prodName+" ProdcutPirce: "+p3.prodPrice+" Price after 18% of Gst: "+ p3.Calgst());
		System.out.println("Product name: "+p4.prodName+" ProdcutPirce: "+p4.prodPrice+" Price after 18% of Gst: "+ p4.Calgst());

	}

}
