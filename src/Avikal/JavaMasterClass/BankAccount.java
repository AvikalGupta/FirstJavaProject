package Avikal.JavaMasterClass;

public class BankAccount {

	private long accountNum;
	private double balance;
	private String customerName;
	private String emailAddress;
	private long phoneNumber;
	
	public BankAccount() {
		this(20121050, 500, "Defaul Name", "default@email.com", 900000000);
	}
	
	
	
	public BankAccount(long accountNum, double balance, String customerName) {
		this(accountNum, balance, customerName, "none@none.com", 0);
	}



	public BankAccount(long accountNum, double balance, String customerName, String emailAddress, long phoneNumber) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.customerName = customerName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}

	public void deposite(double amount) {
		this.balance += amount;
		System.out.println(amount + " deposited successfully.");
		System.out.println("Total amount = " + this.balance);
	}
	
	public void withdrawal(double amount) {
		if((this.balance - amount) < 0 ) {
			System.out.println("Cna't withdrawal " + amount);
			System.out.println("Only " + this.balance + " is available.");
		} else {
			this.balance -= amount;
			System.out.println(amount + " Amount withdrawal");
			System.out.println("Total amount - " + this.balance);
		}
	}
	 
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
