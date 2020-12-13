package Avikal.JavaLab;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr [] = {10, 45, 56, 765, 345, 867, 3547, 46547, 98676, 233, 1 , 11};
		System.out.println("Your Unsorted array :----\n");
		System.out.println(Arrays.toString(arr));
		System.out.println("\nYour sorted array :----\n");
		arr = bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	
	public static int[] bubbleSort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 1; j < (arr.length - i); j++) {
				
				if(arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
