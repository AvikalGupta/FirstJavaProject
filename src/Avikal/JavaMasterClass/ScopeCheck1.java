package Avikal.JavaMasterClass;

public class ScopeCheck1 {

    public final int publicVar = 1;
    private final int privateVar = 0;

    public void print() {
        System.out.println("ScopeCheck1->scopeCheck()--> publicVar = " + publicVar + " privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public class InnerClass {

        private int privateVar = 2;

        public void print() {
            int privateVar = 3;
            System.out.println("PrivateVar inside the inner class = " + ScopeCheck1.this.privateVar);
            System.out.println(Math.PI);
        }
    }
}
