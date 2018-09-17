package javaLearning;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeTest one = new EmployeeTest("test");
		EmployeeTest two = new EmployeeTest("testww");

		one.empAge(23);
		one.empDesignation("IT");
		one.empSalary(20000);
		one.printEmployee();

	}

}
