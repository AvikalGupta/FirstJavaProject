package Avikal.JavaLab;

import java.util.Scanner;

/*				DATE-- 05/10/2020
 * 
 * Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
 * First method named as 'setDim' takes length and breadth of rectangle as parameters 
 * and the second method named as 'getArea' returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard.
 */

public class AreaOfRectangle {


	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter the length of rectangle : - ");
		double length = scn.nextDouble();
		System.out.println("Enter the breath of rectangle: - ");
		double breath = scn.nextDouble();
		rectangle.setDim(length, breath);
		System.out.println("Area -->  " + rectangle.getArea());

		scn.close();
	}

}

class Rectangle {

	private double length;
	private double breath;

	public void setDim(double length, double breath) {
		this.breath = breath;
		this.length = length;
	}

	public double getArea() {
		double area = this.breath * this.length;
		return area;
	}

}
