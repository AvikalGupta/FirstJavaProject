package Avikal.Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of row of the squre matrix : ");
		int num = scn.nextInt();
		int[][] matrix = new int[num][num];
		int[] diagonal_1 = new int[num];
		int[] diagonal_2 = new int[num];
		int sumOfDiagonal_1 = 0;
		int sumOfDiagonal_2 = 0;
		System.out.println("Enter the elements : ");
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				matrix[i][j] = scn.nextInt();
				if(i == j) {
					diagonal_1[i] = matrix[i][j];
					sumOfDiagonal_1 += matrix[i][j];
				}
				if(j == (num - i -1)) {
					diagonal_2[i] = matrix[i][j];
					sumOfDiagonal_2 += matrix[i][j];
				}
			}
		}
		System.out.println(Arrays.toString(diagonal_1));
		System.out.println("Sum of first diagonal: " + sumOfDiagonal_1);
		System.out.println(Arrays.toString(diagonal_2));
		System.out.println("Sum of second diagonal: " + sumOfDiagonal_2);
		scn.close();
	}

}
