package Avikal.JavaMasterClass;
import Avikal.Assignment_2.SelectionSortDesc;

import java.util.Scanner;

public class SortArray {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int num = obj.nextInt();
		int arr[] = getInteger(num);
		arr = SelectionSortDesc.selectionSortInDescOrder(arr, num);
		printArray(arr);
		
	}
	
	public static int[] getInteger(int num) {
		
		Scanner obj = new Scanner(System.in);
		int[] arr = new int[num];
		for(int i = 0; i < num; i++)
			arr[i] = obj.nextInt();
		obj.close();
		return arr;
	}
	
	public static void printArray(int[] arr) {
		
		System.out.println("\nSorted array is ---\n\n");
		for(int x: arr)
			System.out.println(x);
	}

}
