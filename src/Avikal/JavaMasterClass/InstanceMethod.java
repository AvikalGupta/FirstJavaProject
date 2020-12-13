package Avikal.JavaMasterClass;

public class InstanceMethod {
	
	public int firstVar;
	public int secondVar;
	public String thirdVar;
	
	public void instance1() {
		System.out.println("Instance 1 methode called.");
	}
	
	public void instance2(int x, int y) {
		System.out.println("Instance 2 method called.");
		firstVar = x;
		secondVar = y;
		System.out.println("Instance 2 method Variables + " + firstVar + "  " + secondVar);
	}
	
	protected void instance3(int x, int y) {
		instance2(x, y);
		instance1();
		System.out.println("Instance 3 method called");
		thirdVar = "ThirdVar";
		System.out.println(thirdVar);
		
		StaticMethod.static1();		// STATIC METHOD CAN BE CALLED IN INSTANCE METHODE
		
		firstVar = StaticMethod.staticVar1;
//		secondVar = StaticMethod.staticVar4;	// INSTANCE VARIABLE CANT BE USED DIRECTLY IN AOTHER CLASS.
	}
}
