/*
			Write a Java class Complex for dealing with complex number. Your class must have the following features:
			
			Instance variables :
			realPart for the real part of type double
			imaginaryPart for imaginary part of type double.
			
			Constructor:
			public Complex (): A default constructor, it should initialize the number to 0, 0)
			public Complex (double realPart, double imaginaryPart): A constructor with parameters, 
			it creates the complex object by setting the two fields to the passed values.
			
			Instance methods:
			
			public Complex add (Complex otherNumber):
			 This method will find the sum of the current complex number and the passed complex number.
			  The methods returns a new Complex number which is the sum of the two.
			  
			public Complex subtract (Complex otherNumber):
			 This method will find the difference of the current complex number and the passed complex number. 
			  The methods returns a new Complex number which is the difference of the two.

*/
package Avikal.JavaLab;

public class Complex {

	private double realPart;
	private double imaginaryPart;
	
	
//		DEFAULT CONSTRUCTOR
	
	public Complex() {
		realPart = 0;
		imaginaryPart = 0;
	}
	
	
//		PARAMETERIZED CONSTRUCTOR
	
	public Complex(double realPart, double imaginaryPart) {
		super();
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
//		GETTER OF RAELPART AND IMAGINARYPART
	public double getRealPart() {
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
//		ADDITION AND SUBTRACTION OPERATION METHODS
	
	public Complex add(Complex otherNumber) {
		this.imaginaryPart += otherNumber.getImaginaryPart();
		this.realPart += otherNumber.getRealPart();
		return otherNumber;
	}
	
	public Complex subtract(Complex otherNumber) {
		this.imaginaryPart -= otherNumber.getImaginaryPart();
		this.realPart -= otherNumber.getRealPart();
		return otherNumber;
	}
	
	public void print() {
		System.out.println(this.realPart + " + " + this.imaginaryPart + "i");
	}
	

}
