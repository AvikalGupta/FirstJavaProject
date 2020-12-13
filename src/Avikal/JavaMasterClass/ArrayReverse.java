package Avikal.JavaMasterClass;

import java.util.Arrays;

public class ArrayReverse {
	
	public static void main(String args[]) {
		
		int[] arr = {1, 5, 8, 98, 987, 34, 765};		
		System.out.println(Arrays.toString(arr));
		arr = reverseArray(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int[] reverseArray(int[] arr) {
		
		int maxIndex = arr.length - 1;
		int midIndex = arr.length/2;
		for(int i = 0; i < midIndex; i++) {
			int temp = arr[i];
			arr[i] = arr[maxIndex - i];
			arr[maxIndex - i] = temp;
		}

		return arr;
	}
	
	

}
