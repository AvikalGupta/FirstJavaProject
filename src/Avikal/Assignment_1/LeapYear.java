package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 7    ########
 *				 Write a Java program that takes a year from user and print whether that year is a leap year or not.
 */
public class LeapYear {
	public  static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int year = obj.nextInt();
		if(year % 4 == 0 && year % 100 != 0)
			System.out.println("Leap Year");
		else if(year % 100 == 0 && year % 400 == 0)
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
		obj.close();
	}
}
