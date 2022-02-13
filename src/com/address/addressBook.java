package com.address;

import java.util.ArrayList;

public class addressBook {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private int zipcode;
	private String state;
	private String phoneNo;
	private String email;
	static ArrayList<addressBook> contactBook = new ArrayList<>();

	public addressBook(String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8) {

	}

	public void AddressBook(String firstName, String lastName, String address, String city, int zipcode, String state,
			String phoneNo, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String forString() {
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", zipcode=" + zipcode + ", state=" + state + ", phoneNo=" + phoneNo + ", email=" + email
				+ "]";
	}

	public static void displayContacts() {
		int i;
		System.out.println("\nContacts Present in Address Book:");
		for (i = 0; i < contactBook.size(); i++) {
			System.out.println(contactBook.get(i));
		}
	}

	public static void main(String[] args) {
		addressBook Address = new addressBook("Suraj", "Chaudhary", "Pune", "PimpriChinchwad", "411062",
				"Andhra pradesh", "7709911506", "surajchaudhary0707@gmail.com");
		Address.forString();
		addressBook.displayContacts();
	}

}
