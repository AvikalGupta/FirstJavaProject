package Avikal.JavaLab;

import java.util.Arrays;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the lenght of the array: ");
		int length = scn.nextInt();
		int[] arr = new int[length];
		int min = arr[0]; 
		System.out.println("Enter the elements : \n");
		for(int i= 0; i < length; i++) {
			arr[i] =scn.nextInt();
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Your array is : - \n" + Arrays.toString(arr));
		System.out.println("\nyour sorted array is : \n");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("\n\nMinimum element is :- " + min);
		scn.close();
	}
}
