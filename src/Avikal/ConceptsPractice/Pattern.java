package Avikal.ConceptsPractice;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("Enter the number of the rows :");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();

		for(int i = 0; i < num; i++) {

			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= (num - i)-1; k++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		obj.close();
	}
}
