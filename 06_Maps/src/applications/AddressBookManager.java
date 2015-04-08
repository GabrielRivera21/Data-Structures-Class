/*
 * AddressBookManager.java
 * By Antonio F. Huertas
 * Application that manages an address book using a map.
 */

package applications;

import java.util.Scanner;

import datastructures.*;

public class AddressBookManager {

	public static void main(String[] args) {
		Map<Name, Contact> addressBook = new TreeMap<>();
		Scanner kb = new Scanner(System.in);
		int selection = 0;
		
		do {
			System.out.print(
					"1. Add or modify an entry\n" +
					"2. Remove an entry\n" +
					"3. View entries\n" +
					"0. Exit\n\n" +
					"Enter your selection: ");
			selection = kb.nextInt();
			kb.nextLine();             // flush keyboard buffer
			System.out.println();
			
			switch (selection) {
				case 1:
					processAddOrModify(kb, addressBook); break;
				case 2:
					processRemove(kb, addressBook); break;
				case 3:
					processView(addressBook); break;
				case 0:
					System.out.println("Thanks for using this program."); break;
				default:
					System.out.println("Error! Invalid selection. Try again...");
			}
			System.out.println();
		} while (selection != 0);
		kb.close();
	}

	// Adds a new contact to the address book or modifies its values.
	private static void processAddOrModify(Scanner kb, Map<Name, Contact> book) {
		System.out.print("Enter first name: ");
		String first = kb.nextLine();
		System.out.print("Enter last name: ");
		String last = kb.nextLine();
		System.out.print("Enter phone: ");
		String phone = kb.next();
		System.out.print("Enter email: ");
		String email = kb.next();
		
		Name name = new Name(first, last);
		Contact contact = new Contact(name, phone, email);
		book.put(name, contact);
		System.out.println("This contact has been added or modified: " + contact);
	}

	// Removes a contact from the address book.
	private static void processRemove(Scanner kb, Map<Name, Contact> book) {
		System.out.print("Enter first name: ");
		String first = kb.nextLine();
		System.out.print("Enter last name: ");
		String last = kb.nextLine();
		
		Name name = new Name(first, last);
		Contact contact = book.removeKey(name);
		if (contact == null)
			System.out.println("Contact not found. No contact was removed.");
		else
			System.out.println("This contact has been removed: " + contact);
	}
	
	// Lists the contacts in the address book.
	private static void processView(Map<Name, Contact> book) {
		System.out.println("This is the adress book:");
		System.out.println();
		
		for (Entry<Name, Contact> entry: book) {
			System.out.println("Name: " + entry.getValue().getName());
			System.out.println("Phone: " + entry.getValue().getPhone());
			System.out.println("Email: " + entry.getValue().getEmail());
			System.out.println();
		}
		System.out.println("There are " + book.size() + " contacts.");
	}	
	
}