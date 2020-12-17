package Avikal.ConceptsPractice;
import java.util.Scanner;

public class SortForEach {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number of elements to be sorted.");
		int num = obj.nextInt();
		
		int arr[] = new int[num];

		//		INITIALIZING EACH ELEMENT OF THE ARRAY THROUGH SCANNER
		System.out.println("Enter the elements respectively");
		for(int i = 0; i < num; i++) {
			arr[i]= obj.nextInt();
		}

		//		SORTING THE ARRAY 
		for(int i = 0; i < num; i++) {
			for(int j = i + 1; j < num; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		//		PRINTING THE SORTED ARRAY
		System.out.println("after sorting, the final array---");
		for(int x: arr) System.out.println(x);

		obj.close();
	}
}
