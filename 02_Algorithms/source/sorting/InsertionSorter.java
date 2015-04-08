package sorting;

/*
 * InsertionSorter class
 * This is a class that sorts an array by doing an insertion sort
 * and displays how it looks and how many times it traded and moved elements
 * 
 * By Gabriel Rivera Per-ossenkopp
 * 841-11-6930
 * Sici4036-LJ1
 */
public class InsertionSorter<E extends Comparable<E>> implements Sortable<E>{
	
	@Override
	public void sort(E[] data){
		int totaltraded=0; //counter for total exchanges made by sort
		int totalMoves =0; //counter for total movements made by sort
		
		System.out.println("Displaying Array as being sorted...");
		for(int scan=1; scan<data.length;scan++){
			E temp = data[scan];
			int current = scan;
			int moved=0; //initializes the counter for each movement of the element
			int traded=0; //initializes the counter for each exchange
			
			System.out.print("Array: ");
			for(E array : data)
				System.out.print(array + " "); //displays how the array looks at the moment
			System.out.println("\n");
			
			while(current > 0 && data[current-1].compareTo(temp)>0){
				data[current] = data[current-1];
				current--;
				moved++;  //movement of the data
				traded++; //exchange in data
			} //ends while
			data[current] = temp;
			
			System.out.print(scan + ". external cycle has made " + moved + " movements" +
			" and " + traded + " exchanges\n"); //displays movement and exchanges in this cycle
			totalMoves+=moved; //accumulator of total movements
			totaltraded+=traded; //accumulator of total exchanges
		} // ends for
		
		System.out.println("");
		//displays the total of how many trades and movements happened in the sorting
		System.out.println("By doing an Insertion Sort, We did " + totaltraded + " exchanges " +
		"and a total of " + totalMoves + " movements."); 
	}//ends sort
}
