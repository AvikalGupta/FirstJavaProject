package Avikal.JavaLab;

public class Main {

	public static void main(String[] args) {
		Employee E1 = new Employee("John", 35, "90987654321", "Carlifornia", 50000, "Developer");
		Manager M1 = new Manager("Roy", 65, "9988776655", "Kazakistaan", 100000, "HR Department");
//		EMPLOYEE DETAILS
		System.out.println("***EMPLOYEE**\n");
		E1.printAllData();
		System.out.println("Specialization : "+E1.getSpecialization());
//		MANAGER DETAILS
		System.out.println("\n**MANAGER**\n");
		M1.printAllData();
		System.out.println("Department : "+M1.getDepartment());
	}
}
