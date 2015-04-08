package searching;

public class RecursiveBinarySearcher<E extends Comparable<E>> implements Searchable<E> {
	
	private E[] data;
	
	public RecursiveBinarySearcher(E[] data){
		this.data=data;
	}
	
	@Override
	public int search(E value) {
		
		return search(value, 0, data.length-1);
	}

	private int search(E value, int first, int last) {
		if(first>last)
			return -1; //not found
		else{
			int middle = (first+last)/2;
			int comparison = value.compareTo(data[middle]);
			
			if(comparison==0)
				return middle; // found
			else if(comparison<0)
				return search(value, first, middle-1);
			else
				return search(value, middle+1, last);
		}
	}

}
