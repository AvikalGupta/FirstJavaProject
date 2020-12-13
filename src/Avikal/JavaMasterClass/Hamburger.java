package Avikal.JavaMasterClass;

public class Hamburger {
	private String name;
	private String meat;
	private double price;
	private String breadRollType;
	
	private String additional1Name;
	private double additional1Price;

	private String additional2Name;
	private double additional2Price;

	private String additional3Name;
	private double additional3Price;

	private String additional4Name;
	private double additional4Price;
	
	public Hamburger(String name, String meat, double price, String breadRollType) {
		super();
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
	}
	
	public void addHamburgerAdditional1(String name, double price) {
		this.additional1Name = name;
		this.additional1Price = price;
	}

	public void addHamburgerAdditional2(String name, double price) {
		this.additional2Name = name;
		this.additional2Price = price;
	}

	public void addHamburgerAdditional3(String name, double price) {
		this.additional3Name = name;
		this.additional3Price = price;
	}

	public void addHamburgerAdditional4(String name, double price) {
		this.additional4Name = name;
		this.additional4Price = price;
	}
	
	public double itemizedHamburger() {
		double totalPrice = this.price;
		System.out.println(this.name + " Hamburger on a " + this.breadRollType + " roll price is " + totalPrice);
		
		if(additional1Name != null) {
			totalPrice += this.additional1Price;
			System.out.println("Added " + this.additional1Price + " for an an extra " + this.additional1Name);
		}
		if(additional2Name != null) {
			totalPrice += this.additional2Price;
			System.out.println("Added " + this.additional2Price + " for an an extra " + this.additional2Name);
		}
		if(additional3Name != null) {
			totalPrice += this.additional3Price;
			System.out.println("Added " + this.additional3Price + " for an an extra " + this.additional3Name);
		}
		if(additional4Name != null) {
			totalPrice += this.additional4Price;
			System.out.println("Added " + this.additional4Price + " for an an extra " + this.additional4Name);
		}
		
		return totalPrice;
	}

}

class HealthyHamburger extends Hamburger {

	private String healthyAddition1Name;
	private double healthyPrice1;
	
	private String healthyAddition2Name;
	private double healthyPrice2;
	
	public HealthyHamburger(String meat, double price) {
		super("Healthy", meat, price, "Brown rey");
		// TODO Auto-generated constructor stub
	}
	
	public void addHealthyAddition1Name(String name, double price) {
		this.healthyAddition1Name = name;
		this.healthyPrice1 = price;
	}
	
	public void addHealthyAddition2Name(String name, double price) {
		this.healthyAddition2Name = name;
		this.healthyPrice2 = price;
	}
	
	
	@Override
	public double itemizedHamburger() {
		// TODO Auto-generated method stub
		double totalPrice = super.itemizedHamburger();
		
		if(this.healthyAddition1Name != null) {
			totalPrice += this.healthyPrice1;
			System.out.println("Added " + this.healthyPrice1 + " for an an extra " + this.healthyAddition1Name);
		}
		if(this.healthyAddition2Name != null) {
			totalPrice += this.healthyPrice2;
			System.out.println("Added " + this.healthyPrice2 + " for an an extra " + this.healthyAddition2Name);
		}
		
		return totalPrice;
	}	
	
}





//		public static void main(String[] args) {
//			
//			Hamburger hamburger = new Hamburger("MC Donal", "Sausage", 50, "white");
//		//	hamburger.itemizedHamburger();
//			hamburger.addHamburgerAdditional1("Tomato", 15);
//			hamburger.addHamburgerAdditional2("Onion", 20);
//			hamburger.addHamburgerAdditional3("Cheese", 30);
//			hamburger.addHamburgerAdditional4("Chicken", 50);
//			double price = hamburger.itemizedHamburger();
//			System.out.println("Your Total payable amount is " + price);
//			
//		//	ADDING HEALTHY BURGER
//			
//			
//			HealthyHamburger healthyHamburger = new HealthyHamburger("Salad", 60);
//			healthyHamburger.addHealthyAddition1Name("Egg", 20);
//			healthyHamburger.addHealthyAddition2Name("chicken", 100);
//			
//			price += healthyHamburger.itemizedHamburger();
//			System.out.println("Your Total payable amount incuding Healthy Burger is " + price);
//		
//			
//		}