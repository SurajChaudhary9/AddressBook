package com.address;
/*Ability to edit existing contact person using their name
 * Using console to edit person details
 */

import java.util.ArrayList;
import java.util.Scanner;

class addressBook {
	static Scanner scanner = new Scanner(System.in);
	ArrayList<Contacts> person;

	// constructor
	public addressBook() {
		person = new ArrayList<Contacts>();
	}

	// add new person record to array list after taking input

	public Contacts addPerson() {
		System.out.println("Enter the First Name");
		String firstName = scanner.next();
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the Zip");
		String zip = scanner.next();
		System.out.println("Enter the PhoneNumber");
		String phoneNumber = scanner.next();
		System.out.println("Enter the Email");
		String emailId = scanner.next();
		// creating constructor
		Contacts contacts = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, emailId);
		// adding the above list to to Contacts array list
		person.add(contacts);
		// printing the contacts object data inside
		System.out.println(contacts);

		return contacts;

	}// end of addPerson method

	// Editing contact details using person's name
	public void editPerson() {
		System.out.println("Enter name to Edit");
		String s = scanner.next();
		addressBook ab = new addressBook();

		for (int i = 0; i < person.size(); i++) {
			Contacts p = (Contacts) person.get(i);
			if (s.equals(p.getFirstName())) {
				System.out.println(p);
				p = ab.addPerson();/// calling add person to replace initial i/p

				for (int j = 0; j < person.size(); j++) {
					person.set(j, p);
				}

			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program in AddressBookMain class");
		addressBook ab = new addressBook();
		ab.addPerson();
		ab.editPerson();

	}// main end

}/// class end