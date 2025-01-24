package SearchingAlgorithms;

public class RecursiveBinarySearch {
    public int recursiveBinarySearch(int[] numbers, int target, int left, int right) {
        if (left > right) {
            return -1; // target not found
        }
        int mid = left + (right - left) / 2;
        if (numbers[mid] == target) {
            return mid; // Found the target, return index
        } else if (numbers[mid] < target) {
            return recursiveBinarySearch(numbers, target, left + 1, right);
        } else {
            return recursiveBinarySearch(numbers, target, left, mid - 1);
        }
    }
}
