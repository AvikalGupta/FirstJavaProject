package Avikal.JavaMasterClass;

public class Bed {

	public String getStyle() {
		return style;
	}
	public int getHeight() {
		return height;
	}
	public int getPillows() {
		return pillows;
	}
	public int getSheets() {
		return sheets;
	}
	
	
	private String style;
	private int height;
	private int pillows;
	private int sheets;
	
	
	public Bed(String style, int height, int pillows, int sheets) {
		this.style = style;
		this.height = height;
		this.pillows = pillows;
		this.sheets = sheets;
	}
	
	public void make() {
		System.out.println("Bed -> Making");
	}
	
}
