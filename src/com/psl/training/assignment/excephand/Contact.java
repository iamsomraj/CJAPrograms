package com.psl.training.assignment.excephand;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exception Handling
 * 
 * Create a class named Contact with the following attributes : First name,
 * Middle name, Last name, Date of birth, Gender, Anniversary, Address, Area,
 * City, Pincode, State, Country, Telephone number, Mobile number, Email,
 * Website. (Contact.java)
 * 
 * Write a method named validate ( ) in the Contact class created earlier. This
 * method must generate an exception if any of the following validation rules
 * fail:
 * 
 * First name, last name, date of birth and email are compulsory.
 * 
 * E-mail must be in the correct format , display correct format.
 * 
 * At least one of either telephone or mobile number must be specified
 * 
 * 
 * 
 * Note: Do not use Predefine collection classes (API) while implementing
 * assignment
 * 
 * Implement stack for Contact objects. Use exception handling to apply the
 * following rules:
 * 
 * A pop must fail on an uninitialized stack and empty stack
 * 
 * A push must fail on an uninitialized stack and stack which is already full
 * 
 * A push must fail on a stack if the Contact object’s validation fails.
 * 
 * Reading data from movies.txt must handle invalid input.
 * 
 * Check for number of values provided
 * 
 * Check for valid movie Ids. Must be Integers
 * 
 * 
 * 
 * 
 * 
 * 
 * @author Somraj Mukherjee
 *
 */
public class Contact {
	public String firstName, middleName, lastName, dateOfBirth, gender, anniversary, address, area, city, pincode,
			state, country, telephoneNumber, mobileNumber, email, website;

	/**
	 * @param telephoneNumber the telephoneNumber to set
	 */
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Contact(String firstName, String lastName, String dateOfBirth, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}

	public boolean validate() throws Exception {
		if (this.firstName != null && this.lastName != null && this.dateOfBirth != null && this.email != null) {
			String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				if (this.telephoneNumber != null || this.mobileNumber != null) {
					return true;
				} else {
					throw new Exception("Invalid Contact Exception : numbers are missing");				
				}
			} else {
				throw new Exception("Invalid Contact Exception : email id is not valid");
			}
		} else {			
			throw new Exception("Invalid Contact Exception : fields are missing");
		}
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", telephoneNumber=" + telephoneNumber + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}

}