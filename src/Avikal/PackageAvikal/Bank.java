/*
 *	Bank Class
 *	Customer Class
 *	Branch Class
 *	BankMain Class
 */

package Avikal.PackageAvikal;
import java.util.ArrayList;

public class Bank {
	public String getName() {
		return name;
	}

	public ArrayList<Branch> getBranchs() {
		return branchs;
	}

	private String name;
	private ArrayList<Branch> branchs;

	public Bank(String name) {
		super();
		this.name = name;
		this.branchs = new ArrayList<Branch>();
	}

	public Branch findBranch(String branchName) {
		for(int i = 0; i < this.branchs.size(); i++) {
			if(this.branchs.get(i).getName().equals(branchName)) {
				Branch branch = this.branchs.get(i);
				return branch;
			}
		}
		return null;
	}

	public boolean addBranch(String branchName) {
		Branch branch = findBranch(branchName);
		if(branch == null) {
			this.branchs.add(branch);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean addCustomer(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			return branch.newCustomer(customerName, amount);
		}

		return false;
	}

	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			return branch.addCustomerTransaction(customerName, amount);
		}

		return false;
	}

	public boolean lisCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			System.out.println("Customer Details of Branch " + branch.getName());
			ArrayList<Customer> customers = branch.getCustomers();
			for(int i = 0; i < customers.size(); i++) {
				Customer customer = customers.get(i);
				System.out.println("\nCustomer " + "[ " + (i + 1) + " ] "  + customer.getName());
				if(showTransactions) {
					System.out.println("\nTransactions :\n");
					ArrayList<Double> transactions = customer.getTransactions();
					for(int j = 0; j < transactions.size(); j++) {
						System.out.println("[ " + (j + 1 ) + " ] " + transactions.get(j));
					}
				}
			}
			return true;
		}
		
		return false;
	}



























}
