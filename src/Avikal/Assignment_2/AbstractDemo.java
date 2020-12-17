package Avikal.Assignment_2;

public class AbstractDemo {

    public static void main(String[] args) {
        Child child = new Child();
        child.implementThis1();
        child.implementThis2();
        child.getPreImplementedMethod();
    }

}

abstract class Base {

    protected void getPreImplementedMethod() {
        System.out.println("This is getPreImplementedMethod implemented in Base class..");
    }

    protected abstract void implementThis1();
    protected abstract void implementThis2();
}

class Child extends Base{

    @Override
    protected void implementThis1() {
        System.out.println("This is implementThis1() implemented in Child Class.");
    }

    @Override
    protected void implementThis2() {
        System.out.println("This is implementThis2() implemented in Child Class.");
    }
}
