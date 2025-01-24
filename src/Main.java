import Shorting.BubbleShort;

public class Main {
    public static void main(String[] args) {

        int unShortedArray[] = {2, 5, 8, 4, 9, 3, 18, 6, 45, 12, 35, 21, 25, 31};

        BubbleShort bs = new BubbleShort();

        System.out.println("Before Short");
        for (int arr : unShortedArray) {
            System.out.print(arr + " ");
        }

        int result[] = bs.bubbleShort(unShortedArray);

        System.out.println();

        System.out.println("After Short");
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
