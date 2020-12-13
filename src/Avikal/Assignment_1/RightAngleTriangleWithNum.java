package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 11    ########
 * Write a program in Java to make such a pattern like right angle triangle with a number
which will repeat a number in a row
 */

public class RightAngleTriangleWithNum {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println("");
		}
		obj.close();
	}

}
