import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /**************** Insertion Sort *****************/

        /**
         * 
         * runtime: Quadratic time O(n^2)
         * 
         * Advantages:
         * Efficient for small data sets
         * Doesn't require extra memory
         * 
         * Disadvantages:
         * Inefficient for large data sets
         * Bad time complexity
         * 
         */

        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        System.out.println("Before sort: " + Arrays.toString(array));

        insertionSort(array);

        System.out.println("After sort: " + Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {

                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}