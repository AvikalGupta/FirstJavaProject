package Avikal.JavaMasterClass;

public class ConstructorChaining {
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	public ConstructorChaining() {
		this(0, 0);
	}
	
	

	public ConstructorChaining(int width, int height) {
		this(0, 0, width, height);
	}



	public ConstructorChaining(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
}
