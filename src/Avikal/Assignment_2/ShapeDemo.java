package Avikal.Assignment_2;

import java.util.Scanner;

public class ShapeDemo {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square =new Square();

        circle.draw();
        triangle.draw();
        square.draw();
        System.out.println("After calling erase() for every shape");
        System.out.println(circle.erase());
        System.out.println(triangle.erase());
        System.out.println(square.erase());
    }
}


class Shape {
    protected double radius;
    protected double base;
    protected double height;
    protected double len;
    protected double area;

    protected void draw() {
        System.out.println("Enter the volues of asked following.......");
    }

    protected double erase() {
        this.base = 0;
        this.height = 0;
        this.len = 0;
        this.radius = 0;
        this.area = 0;
        return this.area;
    }

}

class Circle extends Shape {


    @Override
    protected void draw() {
        Scanner scn = new Scanner(System.in);
        super.draw();
        System.out.println("Enter the radius...");
        this.radius = scn.nextDouble();
        this.area = 3.14 * this.radius * this.radius;
        System.out.println("Area of Circle :- " + this.area);
    }

    @Override
    protected double erase() {
        return super.erase();
    }
}

class Triangle extends Shape {

    @Override
    protected void draw() {
        Scanner scn = new Scanner(System.in);
        super.draw();
        System.out.println("Enter the base :- ");
        this.base = scn.nextDouble();
        System.out.println("Enter the Height :- ");
        this.height = scn.nextDouble();
        this.area = 0.5 * this.base * this.height;
        System.out.println("Area of Triangle: - " + this.area);
    }

    @Override
    protected double erase() {
        return super.erase();
    }
}

class Square extends Shape {

    @Override
    protected double erase() {
        return super.erase();
    }

    @Override
    protected void draw() {
        super.draw();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of square :- ");
        this.len = scn.nextDouble();
        this.area = this.len * this.len;
        System.out.println("Area of square :- " + this.area);
    }
}

