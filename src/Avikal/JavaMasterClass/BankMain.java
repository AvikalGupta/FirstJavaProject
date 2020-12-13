package Avikal.JavaMasterClass;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		
		//	OPENING THREE BRANCHES
		bank.addBranch("Adalhat");
		bank.addBranch("Naini");
		bank.addBranch("Narayanpur");
		
		//	ADDING CUSTOMER IN ADALHAT BRANCH
		bank.branchList();
		bank.addCustomerWithInitialTransaction("Adalhat", "Avikal", 500.00);
		bank.addTransactionForExistingBranchAndCustomer("Adalhat", "Avikal", 5000);
		bank.addTransactionForExistingBranchAndCustomer("Adalhat", "Avikal", -1000);
		//	ADDING CUSTOMER IN NAINI BRANCH
		bank.addCustomerWithInitialTransaction("Naini", "Rajan", 120.0);
		
		//	ADDING CUSTOMER IN NARAYANPUR BRANCH
		bank.addCustomerWithInitialTransaction("Narayanpur", "John", 500.00);
		
		
		bank.branchList();
		
	}

}