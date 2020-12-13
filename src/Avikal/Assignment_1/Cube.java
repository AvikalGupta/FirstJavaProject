package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 9    ########
 * Write a program in Java to display the cube of the number up to given an integer
 */

public class Cube {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		for(int i = 1; i <= num; i++) {
			int cube = i * i * i;
			System.out.println(i + " = " + cube);
		}
		obj.close();
	}
}
