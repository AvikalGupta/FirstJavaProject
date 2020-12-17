package Avikal.ConceptsPractice;
import java.util.Scanner;

public class DublicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the length of the array.");
		int num = scn.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter the " + num + " elements ");
		
		for(int i = 0; i < num ; i++) 
			arr[i] = scn.nextInt();
		
//		int[] newArr = new int[num];
		
		for(int i= 0; i < num; i++) {
			for(int  j = 0; j < num-1; j++) {
				if(arr[i] == arr[j] && i != j) {
					for(int k = j; k < num-1; k++) {
						arr[k] = arr[k+1];
					}
					num -= 1;
				}
			}
		}
		
		for(int  i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
			
			
			
			
			
		scn.close();
	}

}
