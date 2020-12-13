package Avikal.JavaMasterClass;

public class MotherBoard {



	private String model;
	private String 	manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;

	public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is now loaded.");
	}
		
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public String getBios() {
		return bios;
	}


}

class Resolution {
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	private int width;
	private int height;
	public Resolution(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
}


class Monitor {
	


	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;
	
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
	}
	
		
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	
	
}


class Case {
	
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public Dimensions getDimentions() {
		return dimentions;
	}
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimentions;
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimentions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimentions = dimentions;
	}
	
}

class Dimensions {
	
	private int height;
	private int width;
	private int depth;
	
	
	public Dimensions(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public int getDepth() {
		return depth;
	}
	
}

