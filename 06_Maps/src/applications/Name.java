/*
 * Name.java
 * By Antonio F. Huertas
 * Class that represents a person's name.
 */

package applications;

public class Name implements Comparable<Name> {

	// Fields for the first and last names
	private String first, last;

	// Creates a new name with the given values.
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	// Returns the first name.
	public String getFirst() {
		return first;
	}

	// Returns the last name.
	public String getLast() {
		return last;
	}

	// Returns a negative, zero or positive integer when comparing 
	// this name to another.
	@Override
	public int compareTo(Name other) {
		int comparison = this.last.compareTo(other.last);
		return (comparison != 0) ? comparison : 
			this.first.compareTo(other.first);
	}

	// Returns true if this name is equal to another.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (! (obj instanceof Name))
			return false;
		Name other = (Name)obj;
		return this.first.equals(other.first) &&
				this.last.equals(other.last);
	}

	// Returns the hash code for this name.
	@Override
	public int hashCode() {
		return first.hashCode() + last.hashCode();
	}

	// Returns the string representation of this name.
	@Override
	public String toString() {
		return first + " " + last;
	}

}