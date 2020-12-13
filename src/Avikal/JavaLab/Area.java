package Avikal.JavaLab;	//	23-09-2020

import java.util.Scanner;
import java.lang.System;

public class Area {

	public static Scanner obj = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter Your Choice to find the area of");
		System.out.println("1. Circle");  
		System.out.println("2. Triangle");
		System.out.println("3. Rectangle");
		System.out.println("4. Exit");
		boolean isTrue = false;
		
		while(!isTrue) {
			System.out.println("\nYour choice here.-------------");
			int choice = obj.nextInt();
			switch(choice) {
			case 1:
				areaOfCircle();
				break;
			case 2:
				areaOfTriangle();
				break;
			case 3:
				areaOfRectangle();
				break;
			case 4:
				isTrue = true;
				System.out.println("Program Exit.");
				System.exit(0);
			default:
				System.out.println("Invalid Input");
			}
		}

	}

	static void areaOfCircle() {
		System.out.println("Enter the radius---");
		float radius = obj.nextFloat();
		float area = 3.14f * radius * radius;
		System.out.println("Area of circle = " + area);
	}

	static void areaOfTriangle() {
		System.out.println("Enter the Height -- ");
		float h = obj.nextFloat();
		System.out.println("Enter the base---");
		float b = obj.nextFloat();
		float area = (h * b) / 2;
		System.out.println("Area of Triagnle is = " + area);
	}

	static void areaOfRectangle() {
		System.out.println("enter the heigth of rectangle  ");
		float h = obj.nextFloat();
		System.out.println("enter the width of rectangle  ");
		float w = obj.nextFloat();
		float area = h * w;
		System.out.println("Area of Rectangle is = " + area);

	}
}