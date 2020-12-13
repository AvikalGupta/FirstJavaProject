package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 3    ########
 * Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative"
 */

public class CheckPosNeg {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float num = obj.nextFloat();
		if(num < 0)
			System.out.println("Negative Number");
		else if (num > 0)
			System.out.println("Positive Number");
		else
			System.out.println("Zero Number");
		obj.close();
	}
}