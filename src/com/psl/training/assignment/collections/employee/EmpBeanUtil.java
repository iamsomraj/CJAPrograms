package com.psl.training.assignment.collections.employee;

import java.sql.Date;

public class EmpBeanUtil {

	public static void main(String[] args) {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.displayAllEmployeeInfo();
		employeeBean.displayEmpBeforeDate(Date.valueOf("2020-12-16"));
		employeeBean.displayAsPerJoiningDate();
		employeeBean.displaySixMonths();
	}

}
