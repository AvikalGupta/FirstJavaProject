package Avikal.JavaMasterClass;

public class VipCustomer {
	
	String name;
	double creditLimit;
	String email;
	
	public VipCustomer() {
		this("Default Name", 100.00, "default@email.com");
	}

	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "default@email.com");
	}

	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
	
	
}
