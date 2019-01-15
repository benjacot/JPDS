
public class returnMax {

	public static void main(String[] args) {
		int[] A = {14,3,29,35};
		int bigNum = findMax(A);
		System.out.print(bigNum);
	}
	
	/** return the max value in A
	 * precondition: A is nonempty
	 * postcondition: max value of A is returned */
	public static int findMax(int[] A) {
		int max = A[0];
		// invariant: max is the largest value in A[0..i]
		for (int i = 0; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		return max;
	}

}
