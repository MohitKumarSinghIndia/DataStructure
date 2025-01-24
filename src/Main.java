import SearchingAlgorithms.RecursiveBinarySearch;
import SortingAlgorithms.InsertionSort;

public class Main {
    public static void main(String[] args) {
        // Initialize the unsorted array and the value to search for
        int[] unsortedArray = {2, 5, 8, 4, 9, 3, 18, 6, 45, 12, 35, 21, 25, 31};
        int searchingValue = 5;

        // Instantiate the sorting and searching algorithm objects
        InsertionSort ss = new InsertionSort();
        RecursiveBinarySearch rbs = new RecursiveBinarySearch();

        // Print the array before sorting
        printArray("Array Before Sort:", unsortedArray);

        // Sort the array using Selection Sort
        int[] sortedArray = ss.insertionSort(unsortedArray);

        // Print the array after sorting
        printArray("Array After Sort:", sortedArray);

        // Search for the value using Recursive Binary Search
        System.out.println("\nSearching Element: " + searchingValue);
        int result = rbs.recursiveBinarySearch(sortedArray, searchingValue, 0, sortedArray.length - 1);

        // Display the search result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    // Utility method to print an array with a message
    public static void printArray(String message, int[] array) {
        System.out.println(message);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}