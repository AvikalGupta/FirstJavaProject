package Avikal.JavaLab;

import java.util.Scanner;

public class LetterCount {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word = scn.nextLine();
		word = word.toLowerCase();
		int counter[] = new int [256];
		for(int i = 0; i < word.length(); i++) {
			counter[word.charAt(i)]++;
		}
		char newArray[] = new char[word.length()];
		for(int i = 0; i < word.length(); i++) {
			newArray[i] = word.charAt(i);
			int flag =0;
			for(int j = 0; j < word.length(); j++) {
				if(word.charAt(i) == newArray[j]) {
					flag++;
				}
			}
			if(flag == 1) {
				System.out.println("Char " + word.charAt(i) + " is: " + counter[word.charAt(i)]);
			}
		}
		scn.close();
		char ch[] = new char[2];
		String str = "AA";
		System.out.println(ch[str.charAt(0)]);
	}
}
	