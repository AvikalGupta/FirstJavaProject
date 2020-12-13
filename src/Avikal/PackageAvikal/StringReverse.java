package Avikal.PackageAvikal;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String string = scn.next();
//		int count = 0;
//		for(int i = 0; i< string.length(); i++) {
//			if(string.charAt(i) == string.charAt(string.length()-i-1)) count++;
//		}
//		if(count == string.length()/2)
//			System.out.println("Yes Palindrom");
//		else
//			System.out.println("Not Palindrom");
//		scn.close();
		
		System.out.println(string.equals(new StringBuilder(string).reverse().toString())?"Yes":"No");
		scn.close();

	}

}
