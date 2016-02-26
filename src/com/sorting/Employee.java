package com.sorting;

public class Employee {

	private int employeeNumber;
	private String firstName;
	private String lastName;
	private String emailId;
	
	/**
	 * Constructs a new Employee.
	 * 
	 * @param employeeNumber Employee number
	 * @param firstName First name
	 * @param lastName Last name
	 * @param emailId Email address
	 */
	public Employee(int employeeNumber, String firstName, String lastName, String emailId) {
		this.setEmployeeNumber(employeeNumber);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmailId(emailId);
	}
	
	/**
	 * Returns employee number.
	 *  
	 * @return Employee number
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * Set employee number.
	 * 
	 * @param employeeNumber Employee number
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * Returns employee first name.
	 *  
	 * @return Employee first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set employee first name.
	 * 
	 * @param firstName Employee first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns employee last name.
	 *  
	 * @return Employee last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set employee last name.
	 * 
	 * @param lastName Employee last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns employee email address.
	 *  
	 * @return Employee email address
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * Set employee email address.
	 * 
	 * @param emailId Employee email address
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
