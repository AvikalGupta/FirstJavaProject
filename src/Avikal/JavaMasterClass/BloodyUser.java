package Avikal.JavaMasterClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BloodyUser {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        Scanner scn = new Scanner(System.in);
//        int x = scn.nextInt();
//        String str = sc.next();
//        boolean isValid = true;
//        int len = str.length();
//        for(int i = 0; i < len; i++) {
//            if(!Character.isDigit(str.charAt(i))) {
//                isValid = false;
//                break;
//            }
//        }
//        if(isValid)
//            System.out.println("int : " + Integer.parseInt(str));
//        else
//            System.out.println("Invalid Input");
//        return;

        int x = getInt();
        System.out.println("int x : " + x);

    }

    private static int getInt() {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            return 0;
        }
    }
}
