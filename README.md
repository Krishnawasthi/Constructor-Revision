🏗️ Java Constructors: Ultimate Interview & Practical Guide
Welcome to my learning repository for Java Constructors! This documentation covers essential interview concepts, class work examples, and practical assignments to master how objects are initialized in Java.
💼 Interview Experience Questions
1. What is a constructor in Java? 🤔
•	A constructor is a special block of code that is automatically invoked when an instance (object) of a class is created.
•	Its main purpose is to initialize the state (instance variables) of the newly created object.
•	It has the same name as the class and does not have a return type (not even void).

2. Can a constructor be static? 🛑
•	No. A constructor cannot be static.
•	Why? static members belong to the class itself, whereas a constructor's sole job is to initialize an individual object instance. Making it static would defeat its entire purpose.

3. What is constructor chaining? 🔗
•	Constructor chaining is the process of calling one constructor from another constructor with respect to the current object.
•	It allows you to pass parameters along and reuse initialization code across multiple constructors instead of rewriting it.
•	It can happen within the same class using this() or between a subclass and a superclass using super().



4. Difference between a constructor and a method? ⚖️
Feature	Constructor 🏗️	Method ⚙️
Purpose	Initializes a newly created object.	Contains executable code/behaviors of an object.
Name	Must match the class name exactly.	Can be any valid identifier name.
Return Type	Does not have a return type (not even void).	Must declare a return type (or void).
Invocation	Called automatically via the new keyword.	Must be called explicitly on an object or class.

5. Can a constructor be private? 🔒
•	Yes! A constructor can absolutely be marked as private.
•	When a constructor is private, the class cannot be instantiated from outside its own body. This is a foundational technique used in implementing the Singleton Design Pattern or creating utility classes (like java.lang.Math).

6. What happens if you don't define a constructor in a class? 🤖
•	If you do not write any constructor in your class, the Java compiler automatically provides a hidden, argument-free default constructor for you.
•	Note: If you define any custom constructor (parameterized or no-arg), the compiler will not provide the default constructor automatically.

7. Can a constructor call another constructor in the same class? 🔄
•	Yes. You can do this by using the this() keyword.
•	Crucial Rule: The call to this() must be the very first statement inside the constructor executing the call.

8. Can a constructor throw an exception? ⚠️
•	Yes. A constructor can throw any checked or unchecked exception just like a regular method using the throws clause in its signature.

9. Can we call a constructor explicitly using an object? ❌
•	No. You cannot call a constructor on an already existing object (e.g., obj.ConstructorName()).
•	Constructors are only executed once per object lifetime during the instantiation phase using the new keyword.

10. What is the order of execution in constructor chaining? ⏳
1.	The Superclass constructor executes first (either implicitly or via explicit super()).
2.	The Instance initializers/variables of the current class are setup.
3.	The Subclass constructor body executes last.
•	Summary: Execution moves from the top of the inheritance hierarchy (Object class) downwards to the child class.

11. What happens if a constructor in a subclass does not explicitly call super()? 🕵️‍♂️
If you don't explicitly write super(), the Java compiler automatically inserts an implicit, no-argument super() call as the first line of the subclass constructor.
•	Warning: If the parent class only has a parameterized constructor (and no default no-arg constructor), omitting super() will cause a compile-time error.

12. What is the role of constructors in the Singleton design pattern? 🥇
•	In a Singleton pattern, the constructor is deliberately made private to stop external classes from creating new instances.
•	A controlled global point of access (usually a public static method like getInstance()) manages the creation and delivery of a single, shared instance.

