package com.techdenovo.EmployeeManagementModule.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techdenovo.EmployeeManagementModule.Employee;


public class EmployeeDao {
	List<Employee> employees= new ArrayList<Employee>();
	
	Scanner scanner= new Scanner(System.in);		
//User Input For Employee Details
		public void EmployeeDetails() {
			Employee newEmployee=new Employee();
    		System.out.println("Enter The Details Of Employee  ....");
			System.out.print("Enter Id: ");
			newEmployee.setId(scanner.nextInt());
			System.out.print("Enter First Name: ");
			newEmployee.setFirstName(scanner.next());
			System.out.print("Enter Last Name: ");
			newEmployee.setLastName(scanner.next());
			System.out.print("Enter Salary: ");
			newEmployee.setSalary(scanner.nextInt());
			employees.add(newEmployee);
    	}
		
//	Display The Employee Details
		public void  display() {
			
			if (employees.isEmpty()) {
	            System.out.println("No employees to display.");
	            
	        }

	        for (Employee emp : employees) {
	            System.out.println("Id: " + emp.getId());
	            System.out.println("First Name: " + emp.getFirstName());
	            System.out.println("Last Name: " + emp.getLastName());
	            System.out.println("Salary: " + emp.getSalary());
	            System.out.println(emp);
	            System.out.println("-----------------------");
	        }
		}

//	Search The Employee Details
		public void searchEmployee() {
			 System.out.print("Enter Id to search: ");
		        int id = scanner.nextInt();
		        int count=0;

		        for (Employee emp : employees) {
		            if (emp.getId() == id) {
		                System.out.println("Id: " + emp.getId());
		                System.out.println("First Name: " + emp.getFirstName());
		                System.out.println("Last Name: " + emp.getLastName());
		                System.out.println("Salary: " + emp.getSalary());
		                count=1;
		                break;
		            }
		        }

		        if (count==0) {
		            System.out.println("Employee details not found.");
		        }
		}
		
//		Update The Employee Details
		public void Update() {
			System.out.print("Enter the Id To Update Details:");
			 char choice;
			for (Employee employee : employees) {
				if (employee.getId()==scanner.nextInt()) {
		            System.out.println("1. Update First Name");
		            System.out.println("2. Update Last Name");
		            System.out.println("3. Update Salary");
				}
				
				
					System.out.print("Enter Choice To Update: ");
		            choice = scanner.next().charAt(0);
			
		            switch (choice) {
					case '1': 
						System.out.print("Enter First Name:");
						employee.setFirstName(scanner.next());
						break;
						
					case '2':
						System.out.print("Enter Last Name:");
						employee.setLastName(scanner.next());
						break;
						
					case '3':
						System.out.print("Enter Salary:");
						employee.setSalary(scanner.nextInt());
						break;
						
						
					default:
						System.out.println("invalid Choice");
						break;
		            	
					}
					
				}
				
			}
		}
	

