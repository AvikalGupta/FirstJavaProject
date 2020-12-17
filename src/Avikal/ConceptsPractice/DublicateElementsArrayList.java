package Avikal.ConceptsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class DublicateElementsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the size of the array ");
		int num = scn.nextInt();
		System.out.println("Enter the elements");
		for(int  i = 0; i < num; i++) {
			int element = scn.nextInt();
			list.add(Integer.parseInt(""+element));
		}
		for(int  i = 0; i < num ; i++) {
			for(int j = i+1; j < num; j++) {
				if(list.get(j) == list.get(i)) {
					list.remove(j);
					num--;
				}
			}
		}
		System.out.println(list.toString());
		scn.close();
	}

}
