package com.psl.training.assignment.collections.employee;

import java.sql.Date;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class EmpIdSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpId() - o2.getEmpId();
	}

}

public class EmployeeUtil {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Vehicle maruti = new Vehicle("Maruti", String.valueOf(Math.floor(Math.random() * 10000) + 2355));
		Vehicle tesla = new Vehicle("Tesla", String.valueOf(Math.floor(Math.random() * 10000) + 2355));
		Vehicle[] somrajVehicles = new Vehicle[] { maruti, tesla };
		Employee somraj = new Employee(100, "Somraj", "a", Date.valueOf("2020-12-16"), "a", somrajVehicles);
		System.out.println("The employees are: ");
		System.out.println(employeeService);
		System.out.println("The employee detail one by one: ");
		for (Employee emp : employeeService.getEmployeeList()) {
			System.out.println(emp);
		}
		System.out.println(employeeService);
		List<Employee> employeeList = employeeService.getEmployeeList();
		System.out.println("Is Somraj present? " + employeeList.contains(somraj));
		employeeList.add(somraj);
		System.out.println("Employee List Length: " + employeeList.size());
		Set<Employee> empSet = new LinkedHashSet<Employee>(employeeList);
		System.out.println("Employee Set Length: " + empSet.size());
		Set<Employee> sortedEmpIdSet = new TreeSet<Employee>(new EmpIdSorter());
		sortedEmpIdSet.addAll(employeeList);
		System.out.println("Employee Sorted Id Set: ");
		System.out.println(sortedEmpIdSet);
		Set<Employee> sortedEmpNameSet = new TreeSet<Employee>();
		sortedEmpNameSet.addAll(employeeList);
		System.out.println("Employee Sorted Name Set: ");
		System.out.println(sortedEmpNameSet);
	}

}
