package Avikal.HerbertSchildt;

public class PassOb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj1 = new Test(100, 200);
		Test obj2 = new Test(100, 200);
		Test obj3 = new Test(100, 2000);
		
		System.out.println("obj1 == obj2 " + obj1.isTrue(obj2));
		System.out.println("obj2 == obj3 " + obj2.isTrue(obj3));
	}

}

class Test {
	
	int a, b;
	Test(int i, int j) {
		a = i;
		b = j;
	}
	
	boolean isTrue(Test obj) {
		if(obj.a == a && obj.b == b)
			return true;
		else
			return false;
	}
}
