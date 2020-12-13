package Avikal.JavaMasterClass;

public class Lamp {

	public String getStyle() {
		return style;
	}
	public boolean isHasBattery() {
		return hasBattery;
	}
	public int getGlobalRating() {
		return globalRating;
	}
	private String style;
	private boolean hasBattery;
	private int globalRating;
	public Lamp(String style, boolean hasBattery, int globalRating) {
		this.style = style;
		this.hasBattery = hasBattery;
		this.globalRating = globalRating;
	}
	
	public void turnOn() {
		System.out.println("Lamp -> Turning On");
	}
}
