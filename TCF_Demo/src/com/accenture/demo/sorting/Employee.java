package com.accenture.demo.sorting;

public class Employee implements Comparable<Employee> {


	private int id;
	private String name;
	private String department;

	public Employee(int id, String name, String department){
		this.id = id;
		this.name = name;
		this.department = department;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString(){
		return this.id +" | " + this.name + " | " + this.department ;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
	}

}
