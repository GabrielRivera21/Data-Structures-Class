/*
 * Contact.java
 * By Antonio F. Huertas
 * Class that represents an address book contact.
 */

package applications;

public class Contact {
	
	// Fields for the name, phone and email of this contact
	private Name name;
	private String phone, email;

	// Creates a new contact with the given values.
	public Contact(Name name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	// Returns the name of this contact.
	public Name getName() {
		return name;
	}

	// Returns the phone of this contact.
	public String getPhone() {
		return phone;
	}

	// Returns the email of this contact.
	public String getEmail() {
		return email;
	}
		
	// Returns a string representation of this contact.
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + 
				", email=" + email + "]";
	}
	
}