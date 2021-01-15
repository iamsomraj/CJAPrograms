package com.psl.training.assignment.oms;

public class Customer {
	String id, name, homePhone, cellPhone, workPhone, street, city, state, zip;

	public Customer(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", homePhone=" + homePhone + ", cellPhone=" + cellPhone
				+ ", workPhone=" + workPhone + ", street=" + street + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}

	void printPhoneNumbers() {
		System.out.println(
				"Customer [ homePhone=" + homePhone + ", cellPhone=" + cellPhone + ", workPhone=" + workPhone + "]");
	}

	void printShippingAddress() {
		System.out.println("Customer [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]");
	}

	void setPrintingAddress(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	void setPhoneNumbers(String homePhone, String cellPhone, String workPhone) {
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;
	}

	void printCustomerFields() {
		System.out.println(this.toString());
	}

}