import Sorting.BubbleSort;

public class Main {
    public static void main(String[] args) {

        int unSortedArray[] = {2, 5, 8, 4, 9, 3, 18, 6, 45, 12, 35, 21, 25, 31};

        BubbleSort bs = new BubbleSort();

        System.out.println("Array Before Sort");
        for (int arr : unSortedArray) {
            System.out.print(arr + " ");
        }

        int result[] = bs.bubbleSort(unSortedArray);

        System.out.println();

        System.out.println("Array After Sort");
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
