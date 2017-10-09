package com.accenture.demo.sorting;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {

		return emp1.getDepartment().compareTo(emp2.getDepartment());
	}

}
