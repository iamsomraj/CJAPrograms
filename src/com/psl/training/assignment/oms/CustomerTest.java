package com.psl.training.assignment.oms;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer1 = new Customer("1", "Aa Aaa");
		Customer customer2 = new Customer("2", "Bb Bbb");
		Customer customer3 = new Customer("3", "Cc Ccc");
		
		customer1.setPhoneNumbers("1111111111", "1111111111", "1111111111");
		customer1.setPrintingAddress("11", "11", "11", "11");
		customer2.setPhoneNumbers("22222222", "22222222", "2222222222");
		customer2.setPrintingAddress("22", "22", "22", "22");
		customer3.setPhoneNumbers("3333333333", "3333333333", "3333333333");
		customer3.setPrintingAddress("33", "33", "33", "33");
	
		customer1.printPhoneNumbers();
		customer1.printShippingAddress();
		customer1.printCustomerFields();
		
		customer2.printPhoneNumbers();
		customer2.printShippingAddress();
		customer2.printCustomerFields();
		
		customer3.printPhoneNumbers();
		customer3.printShippingAddress();
		customer3.printCustomerFields();
		
		
	}
	

}
