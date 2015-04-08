/*
 * QuickSorter.java
 * By Antonio F. Huertas
 * Class that represents a quick sorter for arrays.
 */

package sorting;

public class QuickSorter<E extends Comparable<E>> implements Sortable<E> {

	@Override
	public void sort(E[] data) {
		sort(data, 0, data.length - 1);
	}
	
	private void sort(E[] data, int first, int last) {
		if (first < last) {
			int pivotIdx = partition(data, first, last);  // partition about pivot
			sort(data, first, pivotIdx - 1);              // sort first partition
			sort(data, pivotIdx + 1, last);               // sort second partition
		}
	}

	// Partitions an array in two halves, one with the elements <= pivot
	// and the other with elements >= pivot.
	private int partition(E[] data, int first, int last)
	{
		int left = first;
		int right = last;
		E pivot = data[last];

		do {
			while ((left < right) && data[left].compareTo(pivot) <= 0)
				left++;
			while ((right > left) && data[right].compareTo(pivot) >= 0)
				right--;
			if (left < right) {
				E temp = data[left];
				data[left] = data[right];
				data[right] = temp;
			}
		} while (left < right);

		data[last] = data[left];
		data[left] = pivot;
		return left;
	}

}