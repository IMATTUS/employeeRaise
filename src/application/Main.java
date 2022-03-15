package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> employee = new ArrayList<>();
		String name;
		Integer id;
		Double salary;
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee: " + (i+1));
			System.out.println("ID:     ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name:   ");
			name = sc.nextLine();
			System.out.println("Salary: ");
			salary = sc.nextDouble();
			
			employee.add(new Employee(id, name, salary));
		}
		
		System.out.println("Enter the employee id that will have the salary increase: ");
		final int id2 = sc.nextInt();
		sc.nextLine();
		
		Employee employee2 = employee.stream().filter(x -> x.getId() == id2).findFirst().orElse(null);
		
		if (employee2 != null) {
			System.out.println("Enter the percentage: ");
			Double percentage = sc.nextDouble();

			employee2.increaseSalary(percentage);
			
			
			System.out.println("List of employees: ");
			for (Employee employee3 : employee) {
				
				System.out.println(employee3.toString());
			}
		}else {
			System.out.println("ID not found!");
		}
			
		
			
		

		
		sc.close();

	}

}
