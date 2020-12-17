package Avikal.JavaMasterClass;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
            double result = divide();
            System.out.println("X/Y = " + result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }

    }

    public static double divide() {

        int x, y;

//        try {
            x = getInt();
            y = getInt();
            System.out.println("X is " + x + " Y is " + y);
            return (double) x/y;
//        } catch (NoSuchElementException e) {
//            throw new NoSuchElementException("Invadil Input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Divide By Zero");
//        }

    }

    public static int getInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        while(true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Please enter a number 0 to 9 : ");
            }
        }
    }
}
