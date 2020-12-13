package Avikal.JavaMasterClass;


public class Dog extends Animal{

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	private void chew() {
		System.out.println("Dog.chew() called.");
	}

	@Override
	public void eat() {
		chew();
		System.out.println("Dog.eat() called.");
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called.");
		move(5);
	}
	
	public void run() {
		System.out.println("dog.run() called");
		move(20);
	}
	
	public void simple() {
		super.simple();
		System.out.println("And this is loyelest animal in the world.");
	}







}
