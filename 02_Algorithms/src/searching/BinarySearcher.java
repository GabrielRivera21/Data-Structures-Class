package searching;

/*
 * Binary Searcher Class
 * Searches an array by doing a binary search
 * 
 * Gabriel Rivera Per-ossenkopp
 * 841-11-6930
 * SICI4036-LJ1
 */
public class BinarySearcher<E extends Comparable<E>> implements Searchable<E>{
	
	private E[] data;
	
	//Constructor for Binary Searcher
	public BinarySearcher(E[] data) {
		this.data = data;
	}

	//Implements the search method by doing a binary search
	@Override
	public int search(E value) {
		int first=0, last=data.length-1;
		while(first <= last){
			int middle = (first + last)/2;
			System.out.println("Data being checked: " + data[middle]); // shows the current data being checked
			if(value.compareTo(data[middle])<0)
				last = middle -1;
			else if (value.compareTo(data[middle])>0)
				first = middle + 1;
			else
				return middle;  //found at middle
		}
		return -1;	//not found
	}

}
