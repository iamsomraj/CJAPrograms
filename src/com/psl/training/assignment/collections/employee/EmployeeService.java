package com.psl.training.assignment.collections.employee;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	private List<Employee> employeeList = new ArrayList<Employee>();

	public int generateEmployeeId() {
		return (int) (Math.floor(Math.random() * 1000) + 1);
	}

	public EmployeeService() {

		Vehicle maruti = new Vehicle("Maruti", String.valueOf(Math.floor(Math.random() * 10000) + 2355));
		Vehicle tata = new Vehicle("Tata", String.valueOf(Math.floor(Math.random() * 10000) + 2355));
		Vehicle honda = new Vehicle("Honda", String.valueOf(Math.floor(Math.random() * 10000) + 2355));
		Vehicle tesla = new Vehicle("Tesla", String.valueOf(Math.floor(Math.random() * 10000) + 2355));

		Vehicle[] somrajVehicles = new Vehicle[] { maruti, tesla };
		Vehicle[] barshanVehicles = new Vehicle[] { honda, tesla };
		Vehicle[] sayakVehicles = new Vehicle[] { tata, tesla };
		Vehicle[] restVehicles = new Vehicle[] { maruti };
		Vehicle[] dipanjanVehicles = new Vehicle[] { maruti, tesla, honda };

		employeeList.add(
				new Employee(generateEmployeeId(), "Somraj", "a", Date.valueOf("2020-12-16"), "a", somrajVehicles));
		employeeList.add(
				new Employee(generateEmployeeId(), "Barshan", "b", Date.valueOf("2020-8-16"), "b", barshanVehicles));
		employeeList
				.add(new Employee(generateEmployeeId(), "Sayak", "c", Date.valueOf("2020-1-16"), "c", sayakVehicles));
		employeeList.add(
				new Employee(generateEmployeeId(), "Dipanjan", "d", Date.valueOf("2020-10-16"), "d", dipanjanVehicles));
		employeeList
				.add(new Employee(generateEmployeeId(), "Rest", "e", Date.valueOf("2020-5-16"), "e", restVehicles));
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
