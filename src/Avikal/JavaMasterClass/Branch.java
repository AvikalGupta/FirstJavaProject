		// You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

package Avikal.JavaMasterClass;
import java.util.ArrayList;

public class Branch {
	

	public Branch(String branchName) {
		this.branchName = branchName;
	}

	public String branchName;	
	public ArrayList<Customer> customer = new ArrayList<Customer>();
	
	public void addNewCustomer(String name, Double initiateTransactionAmount) {
		this.customer.add(new Customer(name, initiateTransactionAmount));
		System.out.println("New Customer " + name + " is added to " + branchName + " branch with " + initiateTransactionAmount + " amount.");
	}
	
	public void newTransaction(String name, double amount) {
		
		for(int i = 0 ; i < customer.size(); i++) {
			if(customer.get(i).name == name) {
				customer.get(i).transaction.add(amount);
				System.out.println(amount + " of Transaction done in " + name + " customer Account of " + branchName);
				break;
			} 
			else {
				System.out.println(name + "named customer did not found in the " + branchName);
			}
		}
	}
	
	public void customerList() {
		for(int i = 0; i < customer.size(); i++) {
			System.out.println((i+1) + ". " + customer.get(i).getName());
		}
	}
	
	
	
	public String getBranchName() {
		return branchName;
	}

	public ArrayList<Customer> getCustomer() {
		return customer;
	}
	

}
