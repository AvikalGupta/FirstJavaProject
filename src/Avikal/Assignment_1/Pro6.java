package Avikal.Assignment_1;


import java.util.Scanner;
public class Pro6 {

    
  public static void main(String[] args) {
	  
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String ch = obj.next().toLowerCase();

        boolean uprCase = ch.charAt(0) >= 65 && ch.charAt(0) <= 90;
        boolean lwrCase = ch.charAt(0) >= 97 && ch.charAt(0) <= 122;
        boolean vowel = ch.equals("a") || ch.equals("e") || ch.equals("i")
                || ch.equals("o") || ch.equals("u");

        if (ch.length() > 1)
            System.out.println("Error. Not a single character.");
        else if (!(uprCase || lwrCase))
            System.out.println("Invalid input (not a character)");
        else if (vowel)
            System.out.println("Vovel");
        else
            System.out.println("Consonant");
        
        obj.close();
    }
}
