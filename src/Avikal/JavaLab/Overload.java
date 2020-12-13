package Avikal.JavaLab;

import java.util.Scanner;

public class Overload {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isTrue = false;
		System.out.println("Find the Area of..\n" +
				"1. Circle\n" + 
				"2. Triangle\n" + 
				"3. Rectangle\n" + 
				"4. Exit"); 
		while(!isTrue) {
			System.out.println("\n\nEnter your choice here : ");
			int choice = scn.nextInt();
			switch(choice) {

			case 1:
			{
				System.out.println("Enter the radius : ");
				double radius = scn.nextDouble();
				System.out.println("Area of Circle -> " + area(radius));
			}
			break;

			case 2:
			{
				System.out.println("Enter the Base : ");
				double base = scn.nextDouble();
				System.out.println("Enter the Height : ");
				double height = scn.nextDouble();
				Double doubleBase = base;
				Double doubleHeight = height;
				System.out.println("Area of Triangle -> " + area(doubleBase, doubleHeight));
			}
			break;
			case 3:
			{
				System.out.println("Enter the Height : ");
				double height = scn.nextDouble();
				System.out.println("Enter the Width : ");
				double width  = scn.nextDouble();
				System.out.println("Area of Rectangle -> " + area(height, width));
			}
			break;
			case 4:
			{
				isTrue = true;
				System.out.println("Program Ended.");
			}
			break;
			default:
				System.out.println("Invalid Input.");
			}

		}
		scn.close();

	}

	public static double area(double radius) {
		double circleArea = (3.14) * radius * radius;
		return circleArea;
	}

	public static double area(double height, double width) {
		double rectangleArea = height * width;
		return rectangleArea;
	}
//	ACCEPTING A DOUBLE TYPE OBJECT TO OVERCME THE SAME DATATYPE AND PARAMETER IN OVERLOADING
	public static double area(Double base, Double height) {
		double triangleArea = base.doubleValue() * height.doubleValue() / 2;
		return triangleArea;
	}

}


