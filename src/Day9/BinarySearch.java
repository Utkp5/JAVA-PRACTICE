package Day9;

public class BinarySearch {

    // Recursive function to perform binary search
    public static int binarySearch(int[] arr, int low, int high, int target) {
        // Base condition: if the range is invalid, return -1
        if (low > high) {
            return -1;
        }

        // Find the middle element
        int mid = low + (high - low) / 2;

        // If the target is found, return the index
        if (arr[mid] == target) {
            return mid;
        }
        
        // If the target is smaller than the mid element, search the left half
        if (arr[mid] > target) {
            return binarySearch(arr, low, mid - 1, target);
        }
        
        // If the target is greater than the mid element, search the right half
        return binarySearch(arr, mid + 1, high, target);
    }

    public static void main(String[] args) {

        int[] arr = {10, 35, 40, 45, 50, 55, 60, 65, 70, 100};
        int target = 100;  // The number we're searching for
        
        int result = binarySearch(arr, 0, arr.length - 1, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}

