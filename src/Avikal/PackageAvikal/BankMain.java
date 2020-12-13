/*
 *	Bank Class
 *	Customer Class
 *	Branch Class
 *	BankMain Class
 */

package Avikal.PackageAvikal;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("SBI");
		
		bank.addBranch("Adalhat");
//		bank.addBranch("Naini");
//		bank.addBranch("Varanasi");
		
		bank.addCustomer("Adalhat", "Avikal", 500.00);
//		bank.addCustomer("Adalhat", "Vikas", 1500.00);
//		bank.addCustomer("Adalhat", "John", 2500.00);
//		bank.addCustomer("Naini", "Yash", 700.00);
//		bank.addCustomer("Naini", "Rishabh", 10000.00);
//		bank.addCustomer("Varanasi", "Manish", 7000.00);
		
		bank.addCustomerTransaction("Adalhat", "Avikal", 500.00);
		bank.addCustomerTransaction("Adalhat", "Avikal", 700.00);
		bank.addCustomerTransaction("Adalhat", "Avikal", 1200.00);
//		bank.addCustomerTransaction("Naini", "Rishabh", 500.00);
//		bank.addCustomerTransaction("Naini", "Rishabh", 500.00);
//		bank.addCustomerTransaction("Naini", "Rishabh", 500.00);

		bank.lisCustomers("Adalhat", false);
//		bank.lisCustomers("Naini", true);
//		bank.lisCustomers("Varanasi", true);
		bank.lisCustomers("Adalhat", true);



	}

}
