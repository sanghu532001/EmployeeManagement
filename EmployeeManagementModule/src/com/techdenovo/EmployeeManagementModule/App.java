package com.techdenovo.EmployeeManagementModule;

import java.util.Scanner;

import com.techdenovo.EmployeeManagementModule.dao.EmployeeDao;
public class App {

	public static void main(String[] args) {
		EmployeeDao employee=new EmployeeDao();
		 Scanner scanner = new Scanner(System.in);
	        char choice;
	        
	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Add details");
	            System.out.println("2. Display Details");
	            System.out.println("3. Search For Details By Id");
	            System.out.println("4. Update Information");
	            System.out.println("5. Exit");
	            System.out.println("");
	            System.out.print("Enter your choice: ");
	            choice = scanner.next().charAt(0);
	            System.out.println("");
	            
	            switch (choice) {

	                case '1':
	                	employee.EmployeeDetails();
	                	System.out.println("");
	                    break;
	                    
  
	                case '2':
	                	 employee.display();
	                	 System.out.println("");
	                    break;
	                    

	                case '3':
	                    employee.searchEmployee();
	                    System.out.println("");
	                    break;
	                    
	                case '4':
	                	employee.Update();
	                	System.out.println("");
	                	break;
	                	
	                	
	                case '5':
	                    System.out.println("Exiting...");
	                    break;
	                    
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        } 
	        while (choice != '5');
	        scanner.close();
	}

}
