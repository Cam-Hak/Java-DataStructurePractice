import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**************** Selection Sort *****************/

        /**
         * 
         * runtime: O(n^2)
         * 
         * Advantages:
         * Efficient for small data sets
         * Can be more efficient if data is sligtly sorted
         * Doesn't require extra memory
         * 
         * Disadvantages:
         * Very inefficient when dealing with large sets of data
         */

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        System.out.println("Array before sort: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("Array after sort: " + Arrays.toString(array));

    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}