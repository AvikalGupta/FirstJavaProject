package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 2    ########
 * Take three numbers from the user and print the greatest number.
 */

public class Greater {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num1, num2, num3;
		num1 = obj.nextInt();
		num2 = obj.nextInt();
		num3 = obj.nextInt();
		if(num1 >= num2 && num1 >= num3)
			System.out.println(num1 + " is greater");
		else if(num2 >= num1 && num2 >= num3)
			System.out.println(num2 + " is greater");
		else
			System.out.println("More than one same value");
		obj.close();
	}

}
