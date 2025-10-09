

package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        int arr[]  ={1,2,3,4};
        for(int i=0; i<arr.length-1; i++){
            if (i > 0) {
                arr[i] = arr[i] + arr[i-1];
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}