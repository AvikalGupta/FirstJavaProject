package Avikal.Assignment_1;
/*
 *   				 #######  QUESTION NO 13    ########
 * Write a program in Java to print the Floyd's Triangle.
 */
public class Pro13 {
	public static void main(String[] args) {
		int num = 5, count = 0;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				count ++;
				System.out.print(count + " ");
			}
			System.out.println("");
		}
	}

}
