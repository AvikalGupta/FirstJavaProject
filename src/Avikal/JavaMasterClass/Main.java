package Avikal.JavaMasterClass;

public class Main {

	public static void main(String[] args) {
		
		Hamburger hamburger = new Hamburger("MC Donal", "Sausage", 50, "white");
//		hamburger.itemizedHamburger();
		hamburger.addHamburgerAdditional1("Tomato", 15);
		hamburger.addHamburgerAdditional2("Onion", 20);
		hamburger.addHamburgerAdditional3("Cheese", 30);
		hamburger.addHamburgerAdditional4("Chicken", 50);
		double price = hamburger.itemizedHamburger();
		System.out.println("Your Total payable amount is " + price);
		
//		ADDING HEALTHY BURGER
		
		
		HealthyHamburger healthyHamburger = new HealthyHamburger("Salad", 60);
		healthyHamburger.addHealthyAddition1Name("Egg", 20);
		healthyHamburger.addHealthyAddition2Name("chicken", 100);
		
		price += healthyHamburger.itemizedHamburger();
		System.out.println("Your Total payable amount incuding Healthy Burger is " + price);

		
	}
		
}
