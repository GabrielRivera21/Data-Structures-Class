package sorting;

/*
 * SelectionSorter class
 * This class implements the method sort which sorts an array
 * by doing Selection Sort Algorithm and displays how many
 * movements each elements does and finally displays the total movements
 * of sorting the array
 * 
 * By Gabriel Rivera Per-ossenkopp
 * 841-11-6930
 * Sici4036-LJ1
 */
public class SelectionSorter<E extends Comparable<E>> implements Sortable<E> {
	
	@Override
	public void sort(E[] data) {
		int totaltraded=0; //counter for total exchanges made by sorting array
		int totalMoves=0; //counter for total moves
		
		System.out.println("Displaying Array as being Sorted...");
		for(int curr=0; curr< data.length-1; curr++){
			int idxOfMin=curr;
			
			int moved=0; //counter for moving an element in array
			int traded=0; //counter for exchanges in array
			
			System.out.print("Array: ");
			for(E array : data)
				System.out.print(array + " "); //displays array as being sorted
			System.out.println("\n");
			
			for(int idx =curr+1; idx<data.length;idx++)
				if(data[idx].compareTo(data[idxOfMin])<0)
					idxOfMin=idx;
			if(idxOfMin!=curr){
				E tempElem = data[idxOfMin];
				moved++; //element moved counter updated
				data[idxOfMin]= data[curr];
				moved++; //element moved counter updated
				data[curr]=tempElem;
				moved++; //element moved counter updated
				traded++; //exchange counter updated
			}
			System.out.println(curr+1 + ". external cycle made " + moved + " movements" +
			" and " + traded + " exchanges"); //displays total movements and exchanges in cycle
			totaltraded+=traded; //accumulator of exchanges made
			totalMoves+=moved; //accumulator of movements made
		}
		System.out.println("");
		//Displays total movements and exchanges made after sorting
		System.out.println("By doing a Selection Sort, We did a total of " + totaltraded + " exchanges" +
		" and a total of " + totalMoves + " movements."); 
	}

}
