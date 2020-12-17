package Avikal.TestJarPackage;

public class Complex {
    public double realPart, imaginaryPart;

    public Complex(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex Add(Complex otherNumber) {
        this.imaginaryPart = this.imaginaryPart + otherNumber.imaginaryPart;
        this.realPart = this.realPart + otherNumber.realPart;
        return this;
    }
    public Complex Sub(Complex otherNumber) {
        this.realPart = this.realPart - otherNumber.realPart;
        this.imaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart;
        return this;
    }
    public void result(Complex otherNumber) {
        System.out.println(otherNumber.realPart + " + " + otherNumber.imaginaryPart + "i");
    }
}
