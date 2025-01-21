package Day9;

import java.util.Arrays;

class SelectionSort {

    // Selection Sort implementation
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        // List of numbers to sort
        int[] numbers = {55, 25, 15, 40, 60, 35, 17, 65, 75, 10};

        System.out.println("Original List: " + Arrays.toString(numbers));

        // Perform Selection Sort
        selectionSort(numbers);

        System.out.println("Sorted List: " + Arrays.toString(numbers));
    }
}

