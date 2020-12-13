package Avikal.HerbertSchildt;

public class BoxDemo2 {

	public static void main(String[] args) {
		//		TODO Auto-generated method stub

		Box myBox1;	//DCLARE  A
		myBox1 = new Box(); 
		Box myBox2 = new Box();
		Box myBox3 = new Box();
		Box myBox4 = new Box();

		//		ASSIGN VALUES TO MYBOX1 INTANCES VARIABLES
		
		myBox1.width = 10;
		myBox1.depth = 15;
		myBox1.height = 20;
		
		//		ASSIGN VALUES TO MYBOX1 INTANCES VARIABLES
		
		myBox2.width = 20;
		myBox2.depth = 25;
		myBox2.height = 20;
		
		//		ASSIGN VALUES TO MYBOX# INTACE VARIABLES
		
		myBox3.setBox(2, 2, 2);
		myBox4.setBox(5, 5, 5);

		//		COMPUTE THE VOLUME OF BOX

		System.out.println("Volume of Box1 is "  + myBox1.volume());
		System.out.println("Volume of Box2 is " + myBox2.volume());
		System.out.println("Volume of Box3 is " + myBox3.volume());
		System.out.println("Volume of Box4 is " + myBox4.volume());

		//		CALLING BOXTYPE METHOD
		Box getBoxDataType = BoxType();
		System.out.println(getBoxDataType.depth);
		System.out.println(getBoxDataType.height);
		System.out.println(getBoxDataType.width);
	}

	//	DECLARING A METHOD OF BOX TYPE

	public static Box BoxType() {
		Box BoxData = new Box();
		BoxData.depth = 1;
		BoxData.height =5;
		BoxData.width = 3;
		return BoxData;
	}
	

}
