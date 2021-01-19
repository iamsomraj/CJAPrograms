package com.psl.training.assignment.empcoll;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeUtil {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee somraj = new Employee(100, "Somraj", "a", "a", Date.valueOf("2020-12-16"));
		System.out.println("The employees are: ");
		System.out.println(employeeService);
		List<Employee> employeeList = employeeService.getEmployeeList();
		System.out.println("Is Somraj present? " + employeeList.contains(somraj));
		employeeList.add(somraj);
		System.out.println("Employee List Length: " + employeeList.size());
		Set<Employee> empSet = new LinkedHashSet<Employee>(employeeList);
		System.out.println("Employee Set Length: " + empSet.size());
		Set<Employee> sortedEmpSet = new TreeSet<Employee>(employeeList);
		System.out.println("Employee Sorted Set: ");
		System.out.println(sortedEmpSet);
	}

}
