package Avikal.JavaMasterClass;

public class Vehicle {

	private String name;
	private String size;
	private int currentVelocity;
	private int currentDirection;

	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentDirection = 0;
		this.currentVelocity = 0;
	}

	public void steer(int direction) {
		currentDirection += direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
	}

	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
	}

	public void stop() {
		this.currentVelocity = 0;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

}

class Car extends Vehicle {

	private int wheels;
	private int geers;
	private int doors;
	private int currentGeer;
	private boolean isManual;


	public Car(String name, String size, int wheels, int geers, int doors, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.geers = geers;
		this.doors = doors;
		this.currentGeer = 1;
		this.isManual = isManual;
	}

	public void changeGeer(int currentGeer) {
		this.currentGeer = currentGeer;
		System.out.println("Car.changeGeer(): changed to " + this.currentGeer + " geer");
	}

	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
		move(speed, direction);
	}



}

class BMW extends Car {

	private int roadServiceMonths;

	public BMW(int roadServiceMonths) {
		super("BMW", "4WD", 4, 6, 6, false);
		this.roadServiceMonths = roadServiceMonths;
	}

	public void accelerate(int rate) {
		int newVelocity = getCurrentVelocity() + rate;
		if(newVelocity == 0) {
			stop();
			changeGeer(1);
		}
		else if(newVelocity > 0 && newVelocity <= 10)
			changeGeer(1);
		else if(newVelocity > 10 && newVelocity <= 20)
			changeGeer(2);
		else if(newVelocity > 20 && newVelocity <= 30) 
			changeGeer(3);
		else if(newVelocity > 30 && newVelocity <= 40)
			changeGeer(4);
		else if(newVelocity > 40 && newVelocity <= 50)
			changeGeer(5);
		else 
			changeGeer(6);

		if(newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}


}





//public static void main(String[] args) {
//	BMW bmw = new BMW(40);
//	bmw.steer(45);
//	bmw.accelerate(30);
//	bmw.accelerate(10);
//	bmw.accelerate(-30);
//
//}
