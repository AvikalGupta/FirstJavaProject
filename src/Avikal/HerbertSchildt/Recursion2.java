package Avikal.HerbertSchildt;

class RecTest {

	int values[];

	RecTest (int i) {
		values = new int[i];
	}

	void printArray(int i) {
		if(i ==0) return;
		else printArray(i - 1);
		String str = "[" + i + "]" + " " + i;
		System.out.println(str);
	}
}

public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecTest obj = new RecTest(10);
		for(int i = 0; i < 10; i++) obj.values[i] = i;
		obj.printArray(10);
	}

}
