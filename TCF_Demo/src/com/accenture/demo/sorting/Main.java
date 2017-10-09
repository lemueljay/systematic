package com.accenture.demo.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(2, "Juan", "Accounting"));
		list.add(new Employee(1, "Pedro",  "IT"));
		list.add(new Employee(3, "Jude", "Security"));

		System.out.println("Unsorted Collections");

		for(Employee emp: list){
			System.out.println(emp);
		}


		Collections.sort(list);

		System.out.println("Sorted collections based on name using comparable");

		for(Employee emp: list){
			System.out.println(emp);
		}

		System.out.println("Sorted collections based on department using comparator");

		Collections.sort(list, new DepartmentComparator());

		for(Employee emp: list){
			System.out.println(emp);
		}

		System.out.println("Sorted collections based on department using comparator");
		Collections.sort(list, new NameComparator());

		for(Employee emp: list){
			System.out.println(emp);
		}


	}

}
