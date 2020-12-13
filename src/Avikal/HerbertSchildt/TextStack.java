package Avikal.HerbertSchildt;


/*
 * 		CONSIDER THE STACK CLASS SHOWN IN Stack.java, WHILE IT IS TRUE THAT THE METHODS push() and pop()
 * 		DO PROVIDE A CONTROLLED INTERFACE TO THE STACK, THIS INTERFACE IS NOT ENFORCED.
 * 		THAT IS, IT IS POSSIBLE FOR ANOTHER PART OF THE PROGRAM TO BYPASS THESE METHODS AND
 * 		ACCESS THE STACK DIRECTLY. 
 */

public class TextStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();
		
		for(int i = 0; i < 10; i++) myStack1.push(i);
		for(int i = 10; i < 20; i++) myStack2.push(i);
		
		System.out.println("MyStack-1");
		for(int i = 0; i < 10; i++) System.out.println(myStack1.pop());
		
		System.out.println("MyStack-2");
		for(int i = 0; i < 10; i++) System.out.println(myStack2.pop());
		for(int x: myStack1.stck) System.out.println(x);

	}

}

//ziaakbar4zia@gmail.com

