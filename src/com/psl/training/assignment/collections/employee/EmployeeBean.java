package com.psl.training.assignment.collections.employee;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * Date 21.1.21 Java Assignment Create Employee bean store all employee’s
 * information inside Tree set as per employee Id. Provide following
 * functionality to user
 * 
 * a. Display all employee Information.
 * 
 * b. Display all employees who have joined organization before entered date.
 * 
 * c. Display all employees who have completed six months in organization.
 * 
 * d. Display employee as per joining date (recently joined employees at the
 * Top).
 * 
 * @author Somraj Mukherjee
 *
 */
public class EmployeeBean {
	private TreeSet<Employee> employeeTree = new TreeSet<Employee>();

	public EmployeeBean() {
		super();
		EmployeeService employeeService = new EmployeeService();
		System.out.println("All Employees added to the tree: ");
		this.employeeTree.addAll(employeeService.getEmployeeList());
	}

	public void displayAllEmployeeInfo() {
		System.out.println("Displaying all the employee information: ");
		this.employeeTree.forEach((e) -> System.out.println(e));
	}

	public void displayEmpBeforeDate(Date entDate) {
		System.out.println("Displaying all the employee information before the date " + entDate + " : ");
		TreeSet<Employee> resultSet = new TreeSet<Employee>();
		for (Employee emp : this.employeeTree) {
			if (emp.getJoiningDate().before(entDate)) {
				resultSet.add(emp);
			}
		}
		resultSet.forEach((e) -> System.out.println(e));
	}

	public void displaySixMonths() {
		System.out.println("Displaying all the employee information with 6 months of experience: ");
		TreeSet<Employee> resultSet = new TreeSet<Employee>();
		for (Employee emp : this.employeeTree) {
			if ((Period.between(emp.getJoiningDate().toLocalDate(), LocalDate.now()).getMonths() >= 6)) {
				resultSet.add(emp);
			}
		}
		resultSet.forEach((e) -> System.out.println(e));
	}

	public void displayAsPerJoiningDate() {
		System.out.println("Displaying all the employee information as per the joining date : ");
		ArrayList<Employee> resultSet = new ArrayList<Employee>(this.employeeTree);
		System.out.println("Sorting by date: ");
		System.out.println("Sorting with the help of comparator: ");
		Collections.sort(resultSet, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return -1 * o1.getJoiningDate().compareTo(o2.getJoiningDate());
			}
		});
		resultSet.forEach((e) -> System.out.println(e));
	}
}
