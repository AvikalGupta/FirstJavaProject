package Avikal.PackageAvikal;

class Factorial {
	
	int fact(int n) {
		int result;
		if(n==1) return 1;
		result = fact(n-1) * n;
		return result;
	}
}

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fact = new Factorial();
		System.out.println("Factorial of 3 = " + fact.fact(3));
		System.out.println("Factorial of 5 = " + fact.fact(5));
		System.out.println("Factorial of 10 = " + fact.fact(10));
		System.out.println("Factorial of 15 = " + fact.fact(15));

	}

}
