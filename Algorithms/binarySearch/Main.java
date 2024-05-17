import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    /************** Binary Search ***************/

    /*
     * runtime: O(log n)
     *
     * Advantages:
     * Efficient for larger data sets
     * Considered an improvement over linear search
     *
     * Disadvantages:
     * Can only be implemented on a sorted array
     * The process of sorting and then searching will take more time
     */

    int array[] = new int[100];
    int target = 42;

    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }

    // int index = Arrays.binarySearch(array, target);
    int index = binarySearch(array, target);

    if (index == -1) {
      System.out.println(target + " not found");
    } else {
      System.out.println("Element found at: " + index);
    }
  }

  private static int binarySearch(int[] array, int target) {

    int low = 0;
    int high = array.length - 1;

    while (low <= high) {

      int middle = low + (high - low) / 2;
      int value = array[middle];

      System.out.println("middle: " + value);

      if (value < target) {
        low = middle + 1;
      } else if (value > target) {
        high = middle - 1;
      } else {
        return middle; // target found
      }
    }

    return -1; // target not found
  }
}
