package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 8    ########
 * Write a program in Java to display n terms of natural numbers and their sum.
 */

public class SumOfNum {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println("");
		System.out.println("Sum : " + sum);
		obj.close();
	}

}
