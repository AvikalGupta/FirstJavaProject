package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 12    ########
 * Write a program in Java to make such a pattern like right angle triangle with number
increased by 1.
 */
public class Pattern01 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int count = 0;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println("");
		}
		obj.close();
	}

}
