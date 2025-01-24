import SearchingAlgorithms.RecursiveBinarySearch;
import SortingAlgorithms.BubbleSort;

public class Main {
    public static void main(String[] args) {

        int [] unSortedArray = {2, 5, 8, 4, 9, 3, 18, 6, 45, 12, 35, 21, 25, 31};
        int searchingValue = 5;

        RecursiveBinarySearch rbs = new RecursiveBinarySearch();
        BubbleSort bs = new BubbleSort();

        System.out.println("Array Before sort");
        for(int num : unSortedArray){
            System.out.print(num + " ");
        }
        System.out.println();

        int [] sortedArray = bs.bubbleSort(unSortedArray);
        System.out.println("Array After sort");
        for(int num : sortedArray){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Searching Element = " + searchingValue);
        int result = rbs.recursiveBinarySearch(sortedArray, searchingValue, 0, sortedArray.length-1);

        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}
