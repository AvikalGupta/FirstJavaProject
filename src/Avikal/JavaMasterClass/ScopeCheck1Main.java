package Avikal.JavaMasterClass;

public class ScopeCheck1Main {

    public static void main(String[] args) {

        String privateVar= "This is main() String.";
        ScopeCheck1 sc1 = new ScopeCheck1();
        sc1.print();
        System.out.println(sc1.getPrivateVar());
        System.out.println(privateVar);

        ScopeCheck1.InnerClass innerClass = sc1.new InnerClass();
        innerClass.print();
        System.out.println(Math.PI);
//        Math math = new Math();


    }
}
