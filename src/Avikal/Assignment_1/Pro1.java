package Avikal.Assignment_1;
import java.util.Scanner;

/*
 *  				 #######  QUESTION NO 1    ########
 * 			Write a Java program to get a number from the user and print whether it is positive or negative
 */


public class Pro1 {
	public static void main() {
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		if(num < 0)
			System.out.println("Negative Number");
		else if(num > 0)
			System.out.println("Positive Number");
		else
			System.out.println("Neither Positive nor Negative");
		obj.close();
	}
}