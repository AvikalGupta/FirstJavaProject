package Avikal.JavaMasterClass;

import java.util.Scanner;

public class GroceryListMain {

	public static Scanner scn = new Scanner(System.in);
	public static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {

		boolean quit = false;
		int choice = 0;

		printInstructions();
		while(!quit) {
			
			System.out.println("\nEnter Your Choice Here ---  ");
			choice = scn.nextInt();
			scn.nextLine();

			switch(choice) {
				case 1:
					addItem();
					break;
				case 2:
					groceryList.printGroceryList();
					break;
				case 3:
					findByName();
					break;
				case 4:
					findByPosition();
					break;
				case 5:
					modifyByPosition();
					break;
				case 6:
					removeByPosition();
					break;
				case 7:
					removeByName();
					break;
				case 8:
					quit = true;
					System.out.println("Program Execution Stopped.");
					break;
				default:
					System.out.println("Invalid Input");


			}


		}


	}

	public static void printInstructions() {

		System.out.println("1. Add Item In List.");
		System.out.println("2. Print The Grocery List");
		System.out.println("3. Find Item By Name");
		System.out.println("4. Find Item By Position");
		System.out.println("5. Modify Item By Position");
		System.out.println("6. Remove Item By Position");
		System.out.println("7. Remove Item By Name ");
		System.out.println("8. Quit The Program");
	}
	
	public static void addItem() {
		System.out.println("Enter the Item Name :  " );
//		String item = ;
		groceryList.addGrocery(scn.nextLine());
	}
	
	public static void findByName() {
		System.out.println("Enter the Item Name: ");
		String item = scn.nextLine();
		groceryList.findItemByName(item);
	}
	
	public static void findByPosition() {
		System.out.println("Enter the Item Position: ");
		int position = scn.nextInt();
		groceryList.findItemByPosiotion(position);
	}
	
	public static void modifyByPosition() {
		System.out.println("Enter the Item Position: ");
		int position = scn.nextInt();
		scn.nextLine();
		System.out.println("Enter the Item Name: ");
		String item = scn.nextLine();
		groceryList.modifyGroceryList(position, item);
	}
	
	public static void removeByPosition() {
		System.out.println("Enter the Item Position: ");
		int position = scn.nextInt();
		groceryList.removeGroceryByPosition(position);
	}
	
	public static void removeByName() {
		System.out.println("Enter the Item Name: ");
		String item = scn.nextLine();
		groceryList.removeGroceryByName(item.toLowerCase());
	}
	
}
