package Avikal.Assignment_1;
/*
 *   				 					#######  QUESTION NO 20    ########
							Write a Java program to find the value of specified expression.
							
							a. 101 + 0) / 3
							b) 3.0e-6 * 10000000.1
							c) true && true
							d) false && true
							e) (false && false) || (true && true)
							f) (false || false) && (true && true)
 */
public class ValuesOf {
	public static void main(String[] args) {
		a();
		b();
		c();
		d();
		e();
		f();
	}
	
	public static void a() {
		double res = (101 + 0) / 3;
		System.out.println(res);
	}
	public static void b() {
		double res = 3.0e-6d * 10000000.1d;
		System.out.println(res);
	}
	public static void c() {
		if(true && true)
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static void d() {
		if(false && true)
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static void e() {
		if((false && false) || (true && true))
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static void f() {
		if((false || false) && (true && true))
			System.out.println("true");
		else
			System.out.println("false");
	}
}