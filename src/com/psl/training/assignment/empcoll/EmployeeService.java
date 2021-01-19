package com.psl.training.assignment.empcoll;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	private List<Employee> employeeList = new ArrayList<Employee>();

	public EmployeeService() {
		employeeList.add(new Employee(100, "Somraj", "a", "a", Date.valueOf("2020-12-16")));
		employeeList.add(new Employee(101, "Barshan", "b", "b", Date.valueOf("2020-12-16")));
		employeeList.add(new Employee(102, "Sayak", "c", "c", Date.valueOf("2020-12-16")));
		employeeList.add(new Employee(103, "Dipanjan", "c", "c", Date.valueOf("2020-12-16")));
		employeeList.add(new Employee(104, "Rest", "d", "d", Date.valueOf("2020-12-16")));
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "EmployeeService [employeeList=" + employeeList + "]";
	}

}
