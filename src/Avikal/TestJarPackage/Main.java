package Avikal.TestJarPackage;

public class Main {
    public static void main(String[] args) {
        Complex access = new Complex();
        Complex obj = new Complex(4,5);
        Complex add = new Complex(10,10);
        Complex sub = new Complex(2,3);
        obj.Add(add);
        access.result(obj.Add(add));
        obj.Sub(sub);
        access.result(obj.Sub(sub));

    }
}
