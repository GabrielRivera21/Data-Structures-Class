package data;

public class Pair<T> {
	
	private T first, second;

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(!(obj instanceof Pair))
			return false;
		@SuppressWarnings("unchecked")
		Pair<T> other = (Pair<T>) obj;
		return this.first.equals(other.first) && this.second.equals(other.second);
	}
	
	@Override
	public String toString() {
		return "[first=" + first + ", second=" + second + "]";
	}
}
