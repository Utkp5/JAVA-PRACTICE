package Day9;

import java.util.Arrays;

class QuickSort {

    // Quick Sort implementation
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array
            int partitionIndex = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Partition function to place pivot at the correct position
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        // List of elements to sort
        int[] numbers = {12, 20, 22, 16, 25, 18, 8, 10, 6, 15};

        System.out.println("Original List: " + Arrays.toString(numbers));

        // Perform Quick Sort
        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted List: " + Arrays.toString(numbers));
    }
}

