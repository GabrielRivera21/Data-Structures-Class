/*
 * MergeSorter.java
 * By Antonio F. Huertas
 * Class that represents a merge sorter for arrays.
 */

package sorting;

public class MergeSorter<E extends Comparable<E>> implements Sortable<E> {

	@Override
	public void sort(E[] data) {
		Object[] temp = new Object[data.length];
		sort(data, temp, 0, data.length - 1);
	}

	private void sort(E[] data, Object[] temp, int first, int last) {
		if (first < last) {
			int middle = (first + last) / 2;
			sort(data, temp, first, middle);          // sort left half
			sort(data, temp, middle + 1, last);       // sort right half
			merge(data, temp, first, middle, last);   // merge both halves
		}	
	}

	// Merges two sorted halves of an array using a temporary auxiliary array.
	// Precondition: arr[lo..mid] and arr[mid+1..hi] are sorted
	@SuppressWarnings("unchecked")
	private void merge(E[] data, Object[] temp, int first, int middle, int last) {
		int left = first;
		int right = middle + 1;
		int idx = first;

		while (left <= middle && right <= last) {
			if (data[left].compareTo(data[right]) < 0)
				temp[idx++] = data[left++];
			else
				temp[idx++] = data[right++];
		}
		while (left <= middle)
			temp[idx++] = data[left++];
		while (right <= last)
			temp[idx++] = data[right++];

		for (idx = 0; idx <= last; idx++)
			data[idx] = (E)temp[idx];
	}

}