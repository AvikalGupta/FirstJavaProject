package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 16    ########
 * Write a Java program that reads a number in inches, converts it to meters.
 */
public class InchToMeter {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float inch = obj.nextFloat();
		float meter = inch / 39.37f;
		System.out.println(inch + " inch = " + meter + " meter");
		obj.close();
	}
}
