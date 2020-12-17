package Avikal.Assignment_2;

import java.util.Scanner;

public class Matrix {

	public int row;
	public int col;
	public int[][] matrix;
	Scanner scn = new Scanner(System.in);
	Matrix(int row, int col){
		this.row = row;
		this.col = col;
		this.matrix = new int[row][col];
	}
	
	public void  insertData() {
		System.out.println("Enter the element: \n");
		for(int i = 0; i < this.row; i++) {
			for(int j = 0; j < this.col; j++) {
				matrix[i][j] = scn.nextInt();
			}
		}
		
	}
	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}

	public int[][] getMatrix() {
		return this.matrix;
	}
}