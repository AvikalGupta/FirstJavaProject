/*
 *			DATE--09-11-2020
			Create a class named 'Member' having the following members:
			Data members
			1 - Name
			2 - Age
			3 - Phone number
			4 - Address
			5 - Salary
			It also has a method named 'printSalary' which prints the salary of the members.
			
			Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have
			data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and
			salary to an employee and a manager by making an object of both of these classes and print the same.
*/


package Avikal.Assignment_2;

public class Member {
	
	private String name;
	private int age;
	private String phoneNumber;
	private String address;
	private long salary;
	
	public Member(String name, int age, String phoneNumber, String address, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public long getSalary() {
		return salary;
	}
	
	public void printAllData() {
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
		System.out.println("Phone Number : "+getPhoneNumber());
		System.out.println("Address : "+getAddress());
		System.out.println("Salary : "+getSalary());
	}

}

class Employee extends Member{

	private String specialization;
	public Employee(String name, int age, String phoneNumber, String address, long salary, String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
	}
	public String getSpecialization() {
		return specialization;
	}
	
}

class Manager extends Member{

	private String department;
	public Manager(String name, int age, String phoneNumber, String address, long salary, String department) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
}
