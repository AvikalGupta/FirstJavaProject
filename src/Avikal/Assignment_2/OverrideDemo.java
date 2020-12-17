package Avikal.Assignment_2;

public class OverrideDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bite();
        dog.run();
        System.out.println("**************");
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bite();
        puppy.run();
    }
}

class Dog {

    protected void eat() {
        System.out.println(this.getClass().getSimpleName() + " eats biscuits.");
    }

    protected void bite() {
        System.out.println(this.getClass().getSimpleName() + " can bite and is not safe.");
    }

    protected void run() {
        System.out.println(this.getClass().getSimpleName() + " runs very fastly.");
    }


}

class Puppy extends Dog {

//    THIS eat() METHOD INSIDE CHILD CLASS (Puppy) IS OVERRIDING THE BASE CLASS (Dog) eat() METHOD
    @Override
    protected void eat() {
        super.eat();
    }

//    THIS bite() METHOD INSIDE CHILD CLASS (Puppy) IS OVERRIDING THE BASE CLASS (Dog) bite() METHOD
    @Override
    protected void bite() {
        System.out.println(this.getClass().getSimpleName() + " can't bite and is very cute.");
    }

//    THIS run() METHOD INSIDE CHILD CLASS (Puppy) IS OVERRIDING THE BASE CLASS (Dog) run() METHOD
    @Override
    protected void run() {
        System.out.println(this.getClass().getSimpleName() + " can't run fastly but looks cute while running.");
    }
}
