package Sorting;

import java.util.Arrays;

public class SlectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5645, 87, 98, -43434, 3343 };
        Selection(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int MaxIndex = maxIndex(arr, 0, last);
            swaping(arr, last, MaxIndex);
        }
    }

    static int maxIndex(int[] arr, int start, int last) {
        int max = 0;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swaping(int[] arr, int end, int maxIndex) {
        int temp = arr[end];
        arr[end] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
