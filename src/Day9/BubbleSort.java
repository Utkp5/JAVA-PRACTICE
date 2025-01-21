package Day9;

import java.util.Arrays;;

class BubbleSort {

    // Bubble Sort implementation
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // List of numbers to sort
        int[] numbers = {55, 25, 15, 40, 60, 35, 17, 65, 75, 10};

        System.out.println("Original List: " + Arrays.toString(numbers));

        // Perform Bubble Sort
        bubbleSort(numbers);

        System.out.println("Sorted List: " + Arrays.toString(numbers));
    }
}
