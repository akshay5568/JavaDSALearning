package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1,7676, 2, 3, 4};
        Bubbole(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void Bubbole(int[] arr) {
        boolean isSorted;
        for (int i = 0; i < arr.length; i++) {
            isSorted = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSorted = true;
                }
            }

            if (!isSorted) {
                System.out.print("Already Sorted");
                break;
            }

        }

    }
}
