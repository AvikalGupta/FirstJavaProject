package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 14    ########
 * Write a Java program to display Pascal's triangle
 */
public class Pro14 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int rowNum = obj.nextInt();
		int row, col, space, n;
		for(row = 0; row < rowNum; row++) {
			for(space = 0; space < (rowNum - row); space++) {
				System.out.print("  ");
			}
			n = 1;
			for(col = 0; col <= row; col++) {
				System.out.print(n + "  ");
				n = n * (row - col) / (col + 1);
			}
			System.out.println("");
		}
		obj.close();
	}

}
