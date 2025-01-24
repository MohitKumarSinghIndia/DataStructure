package SortingAlgorithms;

public class InsertionSort {
    public int[] insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            // Move elements of numbers[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
        }
        return numbers; // Return the sorted array
    }
}