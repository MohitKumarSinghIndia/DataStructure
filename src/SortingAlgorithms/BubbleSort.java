package SortingAlgorithms;

public class BubbleSort {

    public int[] bubbleSort(int[] numbers ) {
        int size = numbers.length;
        int temp = 0;

        for (int i = 0; i < size; i++) {
            // A flag to check if any swapping happens in this iteration
            boolean swapped = false;
            for (int j = 0; j < size - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swapping happened, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return numbers; // Return the sorted array
    }
}