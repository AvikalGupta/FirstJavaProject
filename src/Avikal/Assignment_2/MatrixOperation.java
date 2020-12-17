//	Write a program for calculating Matrix Operations. 1 Addition. 2 Multiplication.

package Avikal.Assignment_2;

import java.util.Scanner;

public class MatrixOperation {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Choose your option: \n"
							+ "1. Addition\n"
							+ "2. Multiplication\n"
							+ "3. exit");
		boolean isTrue = false;
		while(!isTrue) {
			int choice = scn.nextInt();
			switch(choice) {
			case 1:
				addition();
				break;
			case 2:
				multiplication();
				break;
			case 3:
				isTrue = true;
				break;
			default:
				System.out.println("Invalid input...");
			}
		}
	}
	
	public static void addition() {
		System.out.println("Enter the number of row in sqr matrix: ");
		int sqr = scn.nextInt();
		int[][] matrix1 = mat(sqr);
		int[][] matrix2 = mat(sqr);
		int[][] resultant = new int[sqr][sqr];
		for(int i = 0; i < sqr; i++) {
			for(int j = 0; j < sqr; j++) {
				resultant[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		printResult(resultant, sqr);
	}
	
	public static void multiplication() {
		System.out.println("Enter the number of row in sqr matrix: ");
		int sqr = scn.nextInt();
		int[][] matrix1 = mat(sqr);
		int[][] matrix2 = mat(sqr);
		int[][] resultant = new int[sqr][sqr];
		int sum = 0;
		for(int i = 0; i < sqr; i++) {
			for(int j = 0; j < sqr; j++) {
				for(int k = 0; k < sqr; k++) {
					sum += matrix1[i][k] * matrix2[k][j];
				}
				resultant[i][j] = sum;
				sum = 0;
			}
		}
		printResult(resultant, sqr);
	}
	
	public static void printResult(int[][] matrix, int sqr) {
		System.out.println("Your Resultant matrix is :- ");
		for(int i = 0; i < sqr; i++) {
			for(int j = 0; j < sqr; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static int[][] mat(int sqr){
		System.out.println("Enter the " + (sqr*sqr)+ " elements in matrix");
		int[][] matrix = new int[sqr][sqr];
		for(int i = 0; i<sqr; i++) {
			for(int j=0;j<sqr;j++) {
				matrix[i][j] = scn.nextInt();
			}
		}
		return matrix;
	}

}
