package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 17    ########
 * .Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer
 */
public class SumOfDigit {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		if(num >= 0 && num <= 1000) {
			int sum = 0;
			while(num != 0) {
				int rem = num % 10;
				sum += rem;
				num /= 10;
			}
			System.out.println(sum);
		}
		else {
			System.out.println("Invalid Input");
		}
		obj.close();
	}
}
