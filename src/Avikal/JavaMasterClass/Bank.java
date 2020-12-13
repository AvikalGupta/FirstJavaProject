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

public class Bank {
	
	public ArrayList<Branch> branch = new ArrayList<Branch>();
	
	public void addBranch(String name) {
		this.branch.add(new Branch(name));
	}
	
	public void addCustomerWithInitialTransaction(String branchName, String customerName, Double initialAmount) {
		for(int i = 0; i < branch.size(); i++) {
			if(this.branch.get(i).branchName == branchName) {
				branch.get(i).addNewCustomer(customerName, initialAmount);
				break;
			}
			else {
				System.out.println("Did not found any " + branchName + " named branch.");
			}
		}
	}
	
	public void addTransactionForExistingBranchAndCustomer(String branchName, String customerName, double amount) {
		for(int i = 0; i < branch.size(); i++) {
			if(branch.get(i).branchName == branchName) {
				branch.get(i).newTransaction(customerName, amount);
				break;
			}
			else {
				System.out.println("Did not found any " + branchName + " named branch.");	
			}
			
		}
	}
	
	public void branchList() {
		for(int i = 0; i < branch.size(); i++) {
			System.out.println(branch.get(i).branchName);
		}
	}
	

}




































