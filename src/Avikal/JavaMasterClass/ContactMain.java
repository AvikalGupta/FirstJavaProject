package Avikal.JavaMasterClass;

import java.util.Scanner;

public class ContactMain {
	
	private static Scanner scn = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("9264928257");
	
	public static void main(String[] args) {
		
		boolean quit = false;
		while(!quit) {
			System.out.println("Enter 6 to show actions");
			int action = scn.nextInt();
			switch(action) { 
				case 0:
					quit = true;
					System.out.println("Shutted Down");
					break;
				case 1:
					mobilePhone.printContacts();
					break;
				case 2:
					addNewContact();
					break;
				case 3:
					updateContact();
					break;
				case 4:
					removeContact();
					break;
				case 5:
					queryContact();
					break;
				case 6:
					printAction();
					break;
				default:
					System.out.println("Invalid Input");
				
			}
		}

	}
	
	private static void addNewContact() {
		System.out.println("Enter Contact Name -> ");
		String name = scn.nextLine();
		System.out.println("Enter Mobile Number -> ");
		scn.nextLine();
		String mobileNumber = scn.nextLine();
		Contact newContact = Contact.createNewContact(name, mobileNumber); 
		if(mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added....\nName -> " + name + "\nNumber -> " + mobileNumber);
		}
		else {
			System.out.println("Cant Add " + name + " Alreadty In the File. ");
		}
	}
	
	private static void updateContact() {
		System.out.println("Enter the existing contact name -> ");
		String name = scn.next();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Enter new Contact Name :");
		String newNAme = scn.next();
		System.out.println("Enter new mobile number : ");
		String newNumber = scn.next();
		Contact newContact = Contact.createNewContact(newNAme, newNumber);
		if(mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Successfully Updated");
		}
		else {
			System.out.println("Error Updating Record.");
		}
	}
	
	private static void removeContact() {
		System.out.println("Enter the existing contact name -> ");
		String name = scn.next();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		
		if(mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("SuccessFuly Deleted");
		}
		else {
			System.out.println("Error Deleting Record.");
		}
	}
	
	private static void queryContact() {
		System.out.println("Enter the existing contact name -> ");
		String name = scn.next();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Name : " + existingContactRecord.getName() + " Phone Numbber is : " + existingContactRecord.getName());
	}
	
	private static void printAction() {
		System.out.println("\nChoose Your Action to perform the task: \n" + 
							"0. To Shut Down\n" + 
							"1. To Print contacts\n" + 
							"2. To Add New Contact\n" + 
							"3. To Update Existing Contact\n" + 
							"4. To Remove an Existing Contact\n" +
							"5. Query If An Existing Contact Exist\n" +
							"6.. To Print The Available Actions\n\n" + 
							"Enter Your Choice Here -> ");
	}

}
