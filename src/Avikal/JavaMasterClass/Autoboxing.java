package Avikal.JavaMasterClass;

import java.util.ArrayList;

public class Autoboxing {

	public static void main(String[] args) {

		ArrayList<Integer> integer = new ArrayList<Integer>();

		for(int i = 0; i <= 10; i++) {
			
//			HERE valueof(i) IS TAKING int VALUE AND CONVERTING IT Integer TYPE
//			THIS IS CALLED AUTOBOXING
			integer.add(Integer.valueOf(i));
			
//			THIS IS CALLED UNBOXING TO 
			System.out.println(i + " -> " + integer.get(i).intValue());
		}
	} 

}
