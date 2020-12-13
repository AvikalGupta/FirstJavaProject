package Avikal.JavaMasterClass;

public class StaticMethod {
	
	public static int staticVar1;
	public static int staticVar2;
	public static double staticVar3;
	
	public int staticVar4;
	public int staticVar5;
	public int staticVar6;

	public static void static1() {
		System.out.println("Static 1  method called.");
		InstanceMethod ins = new InstanceMethod();
		ins.instance1();
	}
	
	public static void static2(int x, int y ) {
		System.out.println("Static 2 method called.");
		staticVar1 = x;
		staticVar2 = y;
//		staticVar4 = x;		//Instance Variable cant be called in static method
//		staticVar5= y;
		int insideStaticVar = x+y;
		System.out.println("sVar1 = " + staticVar1 + " sVar2 = " + staticVar2 + " insideSVAr = " + insideStaticVar);
	}
	
	
}
