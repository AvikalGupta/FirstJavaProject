package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 10    ########
 * 			Write a program in Java to display the pattern like right angle triangle with a number
 */

public class Pro10 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print("0 ");
			System.out.println("");
		}
		obj.close();
	}
}
