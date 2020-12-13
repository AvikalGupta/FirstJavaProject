package Avikal.JavaMasterClass;

public class Car2 {

	private boolean engine;
	private int cylinders;
	private int wheels;
	private String name;
	
	public Car2(int cylinder, String name) {
		
		this.cylinders = cylinder;
		this.name = name;
		wheels = 4;
		engine = true;
		
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
	
	public void startEngine() {
		System.out.println(getClass().getSimpleName() + " -> Engine Started");
	}
	
	public void accelerate() {
		System.out.println(getClass().getSimpleName() + " -> Car Accelerated");
		
	}
	
	public void speedBreak() {
		System.out.println(getClass().getSimpleName() + " -> Speed Break");
		
	}
	
}

class Ford extends Car2{

	public Ford(int cylinder, String name) {
		super(cylinder, name);
	}
	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		super.startEngine();
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		super.accelerate();
	}

	@Override
	public void speedBreak() {
		// TODO Auto-generated method stub
		super.speedBreak();
	}
	
}

class Honda extends Car2{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		super.startEngine();
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		super.accelerate();
	}

	@Override
	public void speedBreak() {
		// TODO Auto-generated method stub
		super.speedBreak();
	}

	public Honda(int cylinder, String name) {
		super(cylinder, name);
		// TODO Auto-generated constructor stub
	}
	
}




//		public static void main(String[] args) {
//			
//			Car2 car = new Car2(1, "Car");
//			car.accelerate();
//			car.speedBreak();
//			car.startEngine();
//			
//			Ford Ford = new Ford(1, "Ford");
//			Ford.accelerate();
//			Ford.speedBreak();
//			Ford.startEngine();
//			
//			Honda honda = new Honda(1, "Honda");
//			honda.accelerate();
//			honda.speedBreak();
//			honda.startEngine();
//			
//		}
