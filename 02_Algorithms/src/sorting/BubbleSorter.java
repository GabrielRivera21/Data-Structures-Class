package sorting;

/*
 * BubbleSorter Class
 * This class sorts an array using the bubble sort method algorithm
 * and displays how many movements it does in sorting the array
 * 
 * By Gabriel Rivera Per-ossenkopp
 * 841-11-6930
 * SICI4036-LJ1
 */
public class BubbleSorter<E extends Comparable<E>> implements Sortable<E>{
	
	@Override
	public void sort(E[] data){
		int totaltraded=0; //counter for total exchanges in array
		int totalMove =0; //counter for total movements
		
		System.out.println("Displaying Array being Sorted...");
		for(int i =0; i < data.length-1; i++){
			int moved = 0; //counter for movements of an element in array
			int traded=0; //counter for exchanges in array
			
			System.out.print("Array: ");
			for(E array : data)
				System.out.print(array + " "); //displays how the array currently looks
			System.out.println("\n");
			
			for(int j=0;j<data.length-1;j++){
				if(data[j].compareTo(data[j+1])>0){
					E tempElem = data[j];
					moved++; //element moved counter update
					data[j]=data[j+1];
					moved++; //element moved counter update
					data[j+1]=tempElem;
					moved++; //element moved counter update
					traded++; //element exchange counter updated
				}
			}
			System.out.println(i+1 + ". external cycle we did a total of " + moved + " movements" +
			" and " + traded + " exchange(s)"); //displays movement and exchanges in this cycle
			totalMove+=moved; //accumulates number of movements
			totaltraded+=traded; //accumulates exchanges
		}
		System.out.println("");
		//displays total movements and exchanges after sorting array
		System.out.println("By doing a bubble sort, we did a total of " + totaltraded + " exchanges" +
		" and a total of " + totalMove + " movements."); 
	}
}
