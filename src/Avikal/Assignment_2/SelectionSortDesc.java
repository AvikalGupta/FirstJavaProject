package Avikal.Assignment_2;	//	21-09-2020

import java.util.Scanner;

public class SelectionSortDesc {


	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int num = obj.nextInt();
		int arr[] = new int[num];

		System.out.println("Now Enter the " + num + " elements in array: ");
		for(int i = 0; i < num; i++) arr[i] = obj.nextInt();

		System.out.print("\033[H\033[2J");
		System.out.flush();

		arr = selectionSortInDescOrder(arr, num);
		System.out.println("Sorted Array (Descending Order) is: -");
		for(int x: arr) System.out.println(x);

		obj.close();
	}


	public static int[] selectionSortInDescOrder(int[] arr, int num) {  
		//		ASCENDING ORDER SORTING
		for (int i = 0; i < num - 1; i++)  
		{  
			int maxValue = i;
			for(int j = i + 1; j < num; j++) {
				if(arr[j] > arr[maxValue])
					maxValue = j;
			}
			if(maxValue != i) {
				int temp = arr[i];
				arr[i] = arr[maxValue];
				arr[maxValue] = temp;
			}
		} 
		return arr;
	}  

}

