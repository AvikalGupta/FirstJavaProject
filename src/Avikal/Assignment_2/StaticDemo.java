package Avikal.Assignment_2;

public class StaticDemo {

	public static void main(String[] args) {
		PayTMBank.printStatic();
		PayTMBank pb = new PayTMBank("Avikal", "898768676676");
		pb.printNonStatic();
	}
}

class PayTMBank {

	private static String ifscCode = "PYTM1234";
	private static String bankName = "PayTM Payment Bank";
	private String customerName;
	private String adharNumber;


	static {
		System.out.println("This is the first static block.");
	}


	public PayTMBank(String customerName, String adharNumber) {
		this.customerName = customerName;
		this.adharNumber = adharNumber;
	}

	static {
		System.out.println("this is the sceond static block.");
	}

	public void printNonStatic() {
		System.out.println("this is non-static methode printNonStatic().");
		System.out.println("Bank Name :" + bankName);
		System.out.println("IFSC Code : " + ifscCode);
		System.out.println("Customer Name : " + this.customerName);
		System.out.println("Adhsr number : " + this.adharNumber);
	}

	protected static void printStatic() {
		System.out.println("this is static methode printStatic() where only static data member can be used");
		System.out.println("Bank Name :" + bankName);
		System.out.println("IFSC Code : " + ifscCode);
	}

}



