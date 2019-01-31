class SelectionSort {

  public static void main(String[] args) {
    // unsorted array A
    int[] A = {7, 4, 11, 19, 22, 1};
    // sends A to sort(int[] A)
    sort(A);
  }

  public static void sort(int[] A) {

    // set up for loop for sorting algorithm
    for (int i = 0; i < A.length - 1; i++) {

      // initialize pointer index, currentMin, and minIndex
      int pointerVal = A[i];
      int currentMin = A[i];
      int minIndex = i;

      // set up for loop to check for true currentMin
      for (int j = i+1; j < A.length; j++) {
        if (A[j] < currentMin) {
          minIndex = j;
          currentMin = A[j];
        }
      }

      // check to see if pointer element needs to be swapped
      // if so, send to swap method
      if (i != minIndex) {
        int previousMin = pointerVal;
        A[i] = currentMin;
        A[minIndex] = previousMin;
      }

    }

    // prints out array
    for (int i = 0; i < A.length; i++) {
      System.out.print(A[i] + " ");
    }

  }

}
