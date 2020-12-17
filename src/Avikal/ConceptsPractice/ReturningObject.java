package Avikal.ConceptsPractice;

class Test {
	int a;
	
	Test(int a) {
		this.a = a;
	}
	
	Test incrByTen() {
		Test test = new Test(a + 10);
		return test;
	}
	
}

public class ReturningObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj1 = new Test(2);
		Test obj2;
		obj2 = obj1.incrByTen();
		System.out.println("obj1  " + obj1.a);
		System.out.println("obj2  " + obj2.a);
		obj2 = obj2.incrByTen();
		System.out.println("obj2  " + obj2.a);
	}

}
