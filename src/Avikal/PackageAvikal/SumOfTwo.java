package Avikal.PackageAvikal;

import java.util.Scanner;

public class SumOfTwo {
	public static void main(String[] args) {
		int a, b;
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		int sum = a + b;
		System.out.println(sum);
		obj.close();
	}
}