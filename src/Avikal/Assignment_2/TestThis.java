package Avikal.Assignment_2;

public class TestThis {
	
	private long mobileNumber;
	private String name;
	
	
	
	public TestThis(long mobileNumber, String name) {
//		here "this" keyword refers to the current class instance variables/fields
		this.mobileNumber = mobileNumber;
		this.name = name;
		System.out.println("Inside the parameterized constructor");
	}
	
	public TestThis() {
//		here "this()" refers to invoke current class constructor
		this(999999999, "Unknown Name");
		System.out.println("Inside default constructor.");
	}
	
	public TestThis get() {
//		"this" to return the current class instance
		return this;
	}

	public void display() {
		System.out.println("mobile number : " + this.mobileNumber + "\nName : " + this.name);
	}

	public static void main(String[] args) {

//		obj1 is initialize by default constructor.
		TestThis obj1 = new TestThis();
		obj1.display();
		
//		obj2 is intialized by parameterized constructor
		TestThis obj2 = new TestThis(9876789, "John");
		obj2.display();
		obj2.get().display();
//		creating new object obj3 to demostrate "TestThis get()" methode
		TestThis obj3 = new TestThis(90009000, "Smith");
		obj3.display();
//		Copying all the data of obj2 into the obj3
		obj3 = obj2.get();
		obj3.display();
	}

}
