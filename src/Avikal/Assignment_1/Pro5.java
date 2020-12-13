package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 5    ########
 * Write a Java program that reads in two floating-point numbers and tests whether they are
the same up to three decimal places.

 */
public class Pro5 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		double num1 = obj.nextDouble();
		double num2 = obj.nextDouble();
		num1 = Math.round(num1 * 1000);
		num1 %= 1000;
		num2 = Math.round(num2 * 1000);
		num2 %= 1000;
		if(num1 == num2)
			System.out.println("Same up to last three decimal palace");
		else
			System.out.println("Not same");
		obj.close();
	}

}
