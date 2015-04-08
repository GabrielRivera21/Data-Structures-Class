package searching;

/*
 * LinearSearcher class
 * It searches the array by doing a Linear Search
 * 
 * Edited By Gabriel Rivera Per-ossenkopp
 * 841-11-6930
 * Sici4036-LJ1
 */
public class LinearSearcher<E> implements Searchable<E>{
	
	private E[] data;
	
	//Constructor for the Linear Searcher class
	public LinearSearcher(E[] data){
		this.data=data;
	}
	
	//Implements the search method
	@Override
	public int search(E value){
		for(int x=0; x<data.length;x++){
			System.out.println("Data being checked: " + data[x]); //displays current element being checked
			if(value.equals(data[x]))
				return x;  //found at index
		}
		return -1; //not found
	}
}
