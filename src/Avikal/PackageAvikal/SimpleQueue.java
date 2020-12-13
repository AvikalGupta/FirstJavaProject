package Avikal.PackageAvikal;
import java.util.Scanner;

public class SimpleQueue {
	
	static int front = -1;
	static int rear = -1;
	static int maxSize = 5;
	static int queue[] = new int[maxSize];
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean isTrue = false;
		
		while(!isTrue) {
			printOption();
			int choice  = scn.nextInt();
			switch(choice) {
			
			case 1:
				enQueue();
				break;
			case 2:
				deQueue();
				break;
			case 3: 
				printQueue();
				break;
			case 4:
				isTrue = true;
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
	
	static void enQueue() {
		if(rear == maxSize-1) {
			System.out.println("Queue is full.");
		} 
		else {
			if(front == -1) {
				front = 0;
			}
			System.out.println("Enter the element -> ");
			int element = scn.nextInt();
			rear++;
			queue[rear] = element;
			System.out.println("Element Successfully Inserted.");
		}
		
	}
	
	static void deQueue() {
		if(front == -1 || front > rear) {
			System.out.println("Queue Is Empty.");
		}
		else {
			System.out.println(queue[front] + " element deleted.");
			front++;
			if(front > rear) {
				front = rear = -1;
			}
		}
	}
	
	static void printQueue() {
		if(rear == -1 && front == -1) {
			System.out.println("Empty Queue");
		}
		else {
			System.out.println("=================");
			for(int x = front; x <= rear; x++) {
				System.out.print(queue[x] + " ");
			}
			System.out.println("\n=================");
		}
	}
	
	static void printOption() {
		System.out.println("\n\nOperation\n" +
				"1. Enqueue\n" + 
				"2. Dequeue\n" +
				"3. Print Queue\n" + 
				"4. Exit\n" +
				"\nYour Choice -> ");
	}
}
