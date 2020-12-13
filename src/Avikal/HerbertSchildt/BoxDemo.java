package Avikal.HerbertSchildt;

//BOX DATATYPE

class Box {
	double width;
	double height;
	double depth;
	
	Box(double len) {
		width = height = depth = len;
	}
	
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	Box(Box obj) {
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}
	
	public Box() {
		// TODO Auto-generated constructor stub
		width = -1;
		height = -1;
		depth = -1;
	}

	double volume() {
		return (width * height * depth);
	}

	//	SETTING THE VALUES OF FIELS OF THE BOX CLASS

	void setBox(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}

//THIS CLASS DECLARATION AN OBJECT OF TYPE BOX

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box myBox = new Box();
		double volume;

		//		ASSIGN VALUES TO MYBOXX"S INTANCES VARIABLES
		myBox.width = 10;
		myBox.depth = 15;
		myBox.height = 20;

		//		COMPUTE THE VOLUME OF BOX

		volume = myBox.depth * myBox.height * myBox.width;
		System.out.println(volume);

	}

}
