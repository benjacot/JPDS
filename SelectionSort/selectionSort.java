class selectionSort {

  public static void main(String[] args) {
    int[] A = {17, 4, 9, 3, 5, 6, 11, 20};
    selectionSort(A);
  }

  public static void selectionSort(int[] A) {
    // set for loop to iterate over A
    for (int i = 0; i < A.length; i++) {
      // set first unsorted element as minimum
      int currentMin = A[i];
      // initialize for loop to check for true currentMin
      // initialize mindIndex to keep location of currentMin
      int minIndex = i;
      for (int j = i + 1; j < A.length; i++) {
        if (A[j] < currentMin) {
          minIndex = j;
          currentMin = A[j];
        }
      }
      // swap currentMin with first unsorted position
      int swapValue = A[i];
      A[i] = currentMin;
      A[minIndex] = swapValue;
    }
  }

}
