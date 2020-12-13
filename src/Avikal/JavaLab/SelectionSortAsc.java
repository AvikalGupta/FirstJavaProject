package Avikal.JavaLab;	//	21-09-2020

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortAsc {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int num = obj.nextInt();
		int arr[] = new int[num];
		
		System.out.println("Now Enter the " + num + " elements in array: ");
		for(int i = 0; i < num; i++) arr[i] = obj.nextInt();
		
		arr = selectionSortInAscOrder(arr, num);
		System.out.println("Sorted Array (Ascending Order) is: -");
		System.out.println(Arrays.toString(arr));
		
		obj.close();
	}
	
	public static int[] selectionSortInAscOrder(int[] arr, int num) {  
//		ASCENDING ORDER SORTING
        for (int i = 0; i < num - 1; i++)  
        {  
            int minValue = i;
            for(int j = i + 1; j < num; j++) {
            	if(arr[j] < arr[minValue])
            		minValue = j;
            }
            if(minValue != i) {
            	int temp = arr[i];
            	arr[i] = arr[minValue];
            	arr[minValue] = temp;
            }
        } 
        return arr;
    }   
	
}
