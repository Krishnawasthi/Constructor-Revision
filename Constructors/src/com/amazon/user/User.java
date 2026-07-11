package com.amazon.user;

public class User extends Object{
	private String userName;                       //here we have made a amazon page where there is a guest user id so that there is no need to sign in for user 
	private String userId;                         //he can directly search for the items and and add to them into the cart
	private String mobile;                         //if he find something meaningful he can sign then in amazon.
	private String email;
	
	//static init block
	static {
		 //Any Prerequisites for class we will write into static block
		System.out.println("static init block................"); //this will execute just after loading the class
		//it will execute before main method 
		//execute only once before object is being created
		//Its main purpose is to initialize static variables or perform one-time setup for the class.
	}
	
	   
	  
	
	{
		System.out.println("instance  init block................");    //IIB (instance initialization block
		                                                               //Any Prerequisites for objects we will write into instance init block
	}
	
	
	
	public User(String _userId ){
	
		this("krishna",_userId, "486369336", "krish@gmail.com");//either this can be called for the object(child class) or super can be called for the parent class 
		System.out.println("userMethod......main(1)");          // both can not be called together 
		
	}
	public User(String _userName,String _userId, String _mobile, String _email) {
		
		super();
		System.out.println("userMethod......main(2)");
		this.userName = _userName;
		this.userId  =  _userId;
		this.mobile = _mobile;
		this.email = _email;
		
		
	}
    public static void main(String[] args) {
		
		System.out.println("method......main(0)");
	  
		User u1 = new User("ktishna242_lkfnsfsfn");
		User u2 = new User("shfgshfshflshl");

	}
	

}
