package Avikal.Assignment_1;


public class Complex {
    double realPart, imaginaryPart;
    
    public Complex()
    {
        realPart=0.0;
        imaginaryPart=0.0;
    }
    
    public Complex(double rlPt, double IyPt)
    { 
        rlPt=realPart;
        IyPt=imaginaryPart;
        
        System.out.println("Values are initialized");
    }
    
    public Complex add(Complex addobj)
    {
//        addobj.realPart=addobj.realPart+realPart;
//        addobj.imaginaryPart=addobj.imaginaryPart+imaginaryPart;
    	this.realPart += addobj.realPart;
    	this.imaginaryPart += addobj.imaginaryPart;
        return addobj;
    }
    
    public Complex subtract(Complex subobj)
    {
//        subobj.realPart=subobj.realPart-realPart;
//        subobj.imaginaryPart=subobj.imaginaryPart-imaginaryPart;
    	this.imaginaryPart += subobj.imaginaryPart;
    	this.realPart += subobj.realPart;
        return subobj;
    }

    public static void main(String args[])
    {
        Complex obj1=new Complex(4.1,2.5);
        Complex obj2=new Complex(7.3,8.3);
        
        obj1.add(obj2);
        obj2.subtract(obj2);
        
        System.out.println(" Sum : "+obj1.realPart+" + "+obj1.imaginaryPart);
        System.out.println(" Difference : "+obj1.realPart+ " + " + obj1.imaginaryPart);
        
    }
}
