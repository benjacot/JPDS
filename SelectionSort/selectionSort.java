class selectionSort {
  public static void main(String[] args) {
    int[] A = {17, 4, 9, 3, 5, 6, 11, 20};

  }

  public static int[] selectionSort(int[] A) {
    // initialize currentMin, set to first value in array
    int currentMin = A[0];
    // set up boolean to run while loop
    boolean unsorted = true;
    while (unsorted) {
      // initiate gates to check whether array is unsorted
      for (int i = 0; i < A.length; i++) {
        if (A[i] < currentMin) {
          break;
        }
        
      }
    }

    for (int i = 1; i < A.length; i++) {
      if (A[i] < currentMin) {
        currentMin = A[i];
      }
    }

    return A;
  }
}
