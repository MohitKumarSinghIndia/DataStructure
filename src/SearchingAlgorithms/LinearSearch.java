package SearchingAlgorithms;

public class LinearSearch {

    public int linearSearch(int[] numbers, int target) {

        if (numbers == null) {
            return -1;  // Handle null input
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i; // Found the target, return index
            }
        }
        return -1; //  Target not found
    }
}