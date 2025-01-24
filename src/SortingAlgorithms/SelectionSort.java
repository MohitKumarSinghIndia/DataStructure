package SortingAlgorithms;

public class SelectionSort {
    public int[] selectionSort(int[] numbers) {
        int size = numbers.length;
        int temp = 0;
        int minIndex = -1;

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            // Find the index of the minimum element
            for (int j = i + 1; j < size; j++) {
                if (numbers[minIndex] > numbers[j]) {
                    minIndex = j;
                }
            }
            // Swap only if a smaller element is found
            if (minIndex != i) {
                temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }

        return numbers; // Return the sorted array
    }
}
