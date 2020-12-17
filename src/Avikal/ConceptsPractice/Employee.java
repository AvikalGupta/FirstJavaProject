package Avikal.ConceptsPractice;

public class Employee {
    private String name;
    private int age;
    private String dep;

    public Employee(String name, int age, String dep) {
        this.name = name;
        this.age = age;
        this.dep = dep;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDep() {
        return dep;
    }
}
