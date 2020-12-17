package Avikal.ConceptsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {

    public static void main (String[] args) {
        ArrayList<Employee> emp = new ArrayList<Employee>();

        Employee e1 = new Employee("Joy", 30, "Sales");
        Employee e2 = new Employee("Alexgender", 55, "Developer");
        Employee e3 = new Employee("Jean", 26, "Marketing");

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(new Employee("Smith", 19, "Developer"));

        Iterator<Employee> it = emp.iterator();

        while (it.hasNext()) {
            Employee e = it.next();
            System.out.println(e.getName()
                + "\n" + e.getAge()
                + "\n" + e.getDep());
        }

        System.out.println("******************");
        ArrayList<Employee> emp1 = new ArrayList<Employee>();

        Employee emp1e1 = new Employee("Joy", 30, "Sales");
        Employee emp1e2 = new Employee("Alexgender", 55, "Developer");
        Employee emp1e3 = new Employee("Jean", 26, "Marketing");

        emp.add(emp1e1);
        emp.add(emp1e2);
        emp.add(emp1e3);

        emp.addAll(emp1);

        for(Employee e: emp) {
            System.out.println(e.getName());
        }
        System.out.println("******************");
        emp.removeAll(emp1);
        for(Employee e: emp) {
            System.out.println(e.getName());
        }

        emp.retainAll(emp1);
        System.out.println("*************");
        for(Employee e: emp) {
            System.out.println(e.getName());
        }

        LinkedList<Employee> li = new LinkedList<Employee>();
        li.add(new Employee("Gorge"));
        li.add(new Employee("Tom"));
        li.add(new Employee("Peter"));
        li.add(new Employee("Ronny"));
        li.add(new Employee("Alex"));
        li.addLast(new Employee("Bob"));
        li.removeFirst();
        li.removeLast();
        System.out.println("*****************");
        for(Employee e: li) {
            System.out.println(e.getName());
        }
        System.out.println("*****************");
        LinkedList<String> sl = new LinkedList<String>();
        sl.add("Dj Amit");
        sl.addLast("Viaks");
        sl.add("Shahiba");
        sl.addLast("Nabeela");
        System.out.println(sl);
        if (sl.contains("Viaks")) {
            sl.remove("Viaks");
        }
        System.out.println("*****************");
//        LinkedList<String> sl = new LinkedList<String>();
        System.out.println(sl);
    }

}

