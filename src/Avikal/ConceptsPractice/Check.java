package Avikal.ConceptsPractice;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str[] = new String[3];
		for(int i = 0; i < 3; i++) 
			str[i] = scn.nextLine();
		for(int i = 0; i < 2; i++) {
			if(str[i].compareTo(str[i+1]) > 0) {
				String temp = str[i];
				str[i] = str[i+1];
				str[i+1] = temp;
			}
		}
		for(int i = 0 ; i < 3 ; i++)
			System.out.println(str[i]);
		scn.close();
	}

}
