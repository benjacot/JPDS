
public class insertionSort {

	public static void main(String[] args) {
		int[] A = {4,44,38,5,76, 2, 5, 1};
		insertionSort(A);
		for (int i=0;i<A.length;i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	/** Spec: Sorts A using insertion sort
	 * precondition: A is not empty
	 * postcondition: sorted A is returned */
	public static int[] insertionSort(int[] A) {
		// initialize iterator variable i to 0, i will traverse array in order until end of array
		int i = 0;
		// while i has elements to traverse
		while (i<A.length) {
			/* initialize new variable to refer to index in array
			 * so that i can be used for traversal
			 * and A[k] can be moved leftward through the array as needed */
			int k = i;
			
			// invariant: elements preceding A[k] are sorted
			while (k>0 && A[k] < A[k-1]) {
				// initialize new variable j to save current index value, so that 2 elements can be swapped in the array
				int j = A[k];
				// swap element with previous element
				A[k] = A[k-1];
				A[k-1] = j;
				// decrement k to continue comparing
				k--;
				
			}
			// increment i to continue sorting array
			i++;
		}
		return A;
	}

}
