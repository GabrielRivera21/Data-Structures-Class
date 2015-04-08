package data;

public class Name implements Comparable<Name> {
	
	private String first, last;
	
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	@Override
	public int compareTo(Name other) {
		int comparison = this.last.compareTo(other.last);
		if(comparison ==0)
			comparison = this.first.compareTo(other.first);
		return comparison;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(!(obj instanceof Name))
			return false;
		Name other = (Name) obj;
		return this.first.equals(other.first) && this.last.equals(other.last);
	}

	@Override
	public String toString() {
		return first + " " + last;
	}
	

}
