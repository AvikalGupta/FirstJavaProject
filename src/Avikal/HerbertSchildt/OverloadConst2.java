package Avikal.HerbertSchildt;

import Avikal.HerbertSchildt.Box;

public class OverloadConst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box myBox1 = new Box(10, 20, 30);
		Box myBox2 = new Box();
		Box myBox3 = new Box(7);
		Box myBox4 = new Box(myBox1);
		
		System.out.println("Volume of myBox1 is " + myBox1.volume());
		System.out.println("Volume of myBox2 is " + myBox2.volume());
		System.out.println("Volume of myBox3 is " + myBox3.volume());
		System.out.println("Volume of myBox4 is " + myBox4.volume());
		
	}

}
