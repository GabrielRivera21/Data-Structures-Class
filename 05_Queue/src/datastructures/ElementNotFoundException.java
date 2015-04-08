/*
 * ElementNotFoundException.java
 * By Antonio F. Huertas
 * Class that represents an exception for an element not found in a
 * collection.
 */

package datastructures;

@SuppressWarnings("serial")
public class ElementNotFoundException extends RuntimeException {
	
	// Creates a new exception with the given message.
	public ElementNotFoundException(String message) {
		super(message);
	}
	
	// Creates a new exception with the default message.
	public ElementNotFoundException() {
		super("element was not found");
	}

}