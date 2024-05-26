package com.techdenovo.EmployeeManagementModule;

public class Employee {
	
	private int id;
	private int salary;
	private String firstName;
	private String lastName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id,String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		
		return "[ id: "+id+" , FirstName: "+firstName+" , LastName: "+lastName+" , Salary: "+salary+"]";
	}
	

}
