package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 15    ########
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 */
public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float f = obj.nextFloat();
		float c = (((f - 32) * 5) / 9);
		System.out.println(c + " Celsious");
		obj.close();
	}

}
