package Searching;

import java.util.Arrays;

public class SuccessfulPairs {
    public static void main(String[] args) {
        int [] arr = {5,1,3};
        int [] arr2 = {1,2,3,4,5};
        int [] ans = successfulPairs(arr,arr2,7);
        System.out.println(Arrays.toString(ans));
    }
//This code version was right but not optimized because we were using double for loop because of it our time complexity increased O(n*M);
//We have to use binary search approaches;
//    static int[] successfulPairs(int[] spells, int[] potions, long success) {
//        int [] arr = new int [spells.length];
//        int index = 0;
//        int count = 0;
//        for(int i=0; i<spells.length; i++){
//            for(int j=0; j<potions.length; j++){
//                if ((long) spells[i] * potions[j] >= success) {
//                    count++;
//                }
//            }
//            arr[index++] = count;
//            count = 0;
//        }
//        return arr;
//    }


    static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int [] arr = new int [spells.length];
        Arrays.sort(potions);
        for(int i=0; i<spells.length; i++){
            int start = 0;
            int end = potions.length-1;
            int count = 0;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if((long)spells[i] * potions[mid] >= success){
                    count = potions.length - mid;
                    end = mid - 1;
                }else start = mid + 1;
            }
            arr[i] = count;
        }
        return arr;
    }
}
