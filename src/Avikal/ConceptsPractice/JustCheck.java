package Avikal.ConceptsPractice;

public class JustCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int send = 20;
			Call(send);
	}
	public static void Call(int x) {
		if(x > 10) {
			System.out.println("X is > 10");
			return;
		}
		else {
			System.out.println("x is < 10");
		}
	}

}
