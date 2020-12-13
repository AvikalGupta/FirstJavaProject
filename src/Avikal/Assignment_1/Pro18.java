package Avikal.Assignment_1;

import java.util.Scanner;

/*
 *   				 #######  QUESTION NO 18    ########
				 * Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds),
				 *  and display the speed, in meters per second,
				 *  kilometers per hour and miles per hour
 */
public class Pro18 {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		double meter = obj.nextDouble();
		System.out.println("Enter time was taken hours, minutes, seconds");
		
		int hours = obj.nextInt();
		int minutes = obj.nextInt();
		int seconds = obj.nextInt();
		
		double totalSec = (hours * 60 * 60) + (minutes * 60) + seconds;
		double totalHours = totalSec/60/60;
		double km = meter / 1000;
		double miles = km / 1.609344d;
	
		double speed = meter / totalSec;
		System.out.println("Speed = " + speed + " m/s");
		
		speed = km / totalHours;
		System.out.println("Speed = " + speed + " km/h");
		
		speed = miles / totalHours;
		System.out.println("Speed = " + speed + " miles/hours");
		obj.close();
	}

}
