package Avikal.JavaLab;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void Main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] arr = new int[num];
		for(int i =0; i< num;i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("search element");
		int search = scn.nextInt();
		binarySearch(arr, search);
		scn.close();
	}
	
	public static void binarySearch(int arr[], int searchNum) {
		
		int first = 0;
		int last = arr.length;
		int middle = (first + last) / 2;

		while(first <= last) {
			if(arr[middle] < searchNum)
				first = middle + 1;
			else if(arr[middle] == searchNum) {
				System.out.println("Number ai at " + middle + " position");
				break;
			}
			else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}

		if(first > last) {
			System.out.println("Searched number isn't present in the array.");
		}
	}
}
