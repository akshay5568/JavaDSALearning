package BasicAlgorithm;

import java.util.Arrays;

public class SortingZeros {
    public static void main(String[] args) {
        int [] arr = {1,4,0,2,0,0};
        sortingZero(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void sortingZero(int [] arr){
         for(int i=0; i<arr.length; i++){
             for (int j=1; j<arr.length; j++){
                  if(arr[j-1] == 0){
                       int temp = arr[j-1];
                       arr[j-1] = arr[j];
                       arr[j] = temp;
                  }
             }
         }
    }
}
