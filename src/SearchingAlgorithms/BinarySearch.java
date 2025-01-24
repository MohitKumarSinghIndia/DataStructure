package SearchingAlgorithms;

public class BinarySearch {
    public int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            // Avoid overflow by calculating mid
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                return mid; // Found the target, return index
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; //  Target not found
    }
}