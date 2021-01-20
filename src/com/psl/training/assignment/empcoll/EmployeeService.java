package com.psl.training.assignment.empcoll;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	private List<Employee> employeeList = new ArrayList<Employee>();

	public int generateEmployeeId() {
		return (int) (Math.floor(Math.random() * 1000) + 1);
	}

	public EmployeeService() {
		employeeList.add(new Employee(generateEmployeeId(), "Somraj", "a", "a", Date.valueOf("2020-12-16")));
		employeeList.add(new Employee(generateEmployeeId(), "Barshan", "b", "b", Date.valueOf("2020-12-16")));
		employeeList.add(new Employee(generateEmployeeId(), "Sayak", "c", "c", Date.valueOf("2020-12-16")));
		employeeList.add(new Employee(generateEmployeeId(), "Dipanjan", "c", "c", Date.valueOf("2020-12-16")));
		employeeList.add(new Employee(generateEmployeeId(), "Rest", "d", "d", Date.valueOf("2020-12-16")));
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
