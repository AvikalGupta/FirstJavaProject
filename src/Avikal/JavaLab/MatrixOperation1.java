package Avikal.JavaLab;

import java.util.Scanner;

public class MatrixOperation1 {
	
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean isTrue = false;
		while(!isTrue) {
			System.out.println("\n\nChoose your option: \n"
					+ "1. Addition\n"
					+ "2. Multiplication\n"
					+ "3. exit");
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
		System.out.println("Enter number of rows of matrix 1: ");
		int rowMatrix1 = scn.nextInt();
		System.out.println("Enter number of columns of matrix 1: ");
		int colMatrix1 = scn.nextInt();
		System.out.println("Enter number of rows of matrix 2: ");
		int rowMatrix2 = scn.nextInt();
		System.out.println("Enter number of columns of matrix 2: ");
		int colMatrix2 = scn.nextInt();
		if(rowMatrix1 != rowMatrix2 || colMatrix1 != colMatrix2) {
			System.out.println("Not Possible addition for " + rowMatrix1 + "*" + colMatrix1 + " and " + rowMatrix2 + "*" + colMatrix2);
			return;
		}
		else {
			Matrix matrix1 = new Matrix(rowMatrix1, colMatrix1);
			Matrix matrix2 = new Matrix(rowMatrix2, colMatrix2);
			int[][] newMatrix = new int[rowMatrix1][rowMatrix2];
			matrix1.insertData();
			matrix2.insertData();
			int [][] mat1 = matrix1.getMatrix();
			int [][] mat2 = matrix2.getMatrix();
			for(int i = 0; i < rowMatrix1; i++) {
				for(int j = 0; j < colMatrix2; j++) {
					newMatrix[i][j] = mat1[i][j] + mat2[i][j];
				}
			}
			printMatrix(rowMatrix1, rowMatrix2, newMatrix);
		}
	}
	
	public static void multiplication() {
		System.out.println("Enter number of rows of matrix 1: ");
		int rowMatrix1 = scn.nextInt();
		System.out.println("Enter number of columns of matrix 1: ");
		int colMatrix1 = scn.nextInt();
		System.out.println("Enter number of rows of matrix 2: ");
		int rowMatrix2 = scn.nextInt();
		System.out.println("Enter number of columns of matrix 2: ");
		int colMatrix2 = scn.nextInt();
		if(colMatrix1 != rowMatrix2) {
			System.out.println("Cant multiply for " +  rowMatrix1 + "*" + colMatrix1 + " and " + rowMatrix2 + "*" + colMatrix2);
			return;
		} 
		else {
			Matrix matrix1 = new Matrix(rowMatrix1, colMatrix1);
			Matrix matrix2 = new Matrix(rowMatrix2, colMatrix2);
			matrix1.insertData();
			matrix2.insertData();
			int[][] mat1 = new int[rowMatrix1][colMatrix1];
			int[][] mat2 = new int[rowMatrix2][colMatrix2];
			int[][] newMatrix = new int[rowMatrix1][colMatrix2];
			mat1 = matrix1.getMatrix();
			mat2 = matrix2.getMatrix();
			int sum = 0;
			for(int i = 0; i < rowMatrix1; i++) {
				for(int j = 0; j < colMatrix2; j++) {
					for(int k = 0; k < rowMatrix2; k++) {
						sum += mat1[i][k] * mat2[k][j];
					}
					newMatrix[i][j] = sum;
					sum = 0;
				}
			}
			printMatrix(rowMatrix1, colMatrix2, newMatrix);
		}
	}
	
	public static void printMatrix(int row, int col, int[][]matrix) {
		System.out.println("Your Resultant matrix is : \n\n");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println("");
		}
	}
}