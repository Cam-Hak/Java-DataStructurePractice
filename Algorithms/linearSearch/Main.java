public class Main {

  public static void main(String[] args) {
    /************** Linear Search *************/
    /*
     * runtime complexity: O(n)
     *
     * Disadvantages:
     * Inefficient for large data sets
     *
     * Advantages:
     * Fast for searches of small to medium data sets
     * Does not need to be sorted
     * Useful for data structures that do not have random access
     */

    int[] array = { 1, 6, 7, 8, 9, 4, 5, 2, 3 };

    int index = linearSearch(array, 4);

    if (index != -1) {
      System.out.println("Element found at index: " + index);
    } else {
      System.out.println("Element not found");
    }
  }

  private static int linearSearch(int[] array, int value) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }
    return -1;
  }
}
