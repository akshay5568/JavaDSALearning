package BinarySearch;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch2 {
    public static void main(String[] args) {
         int [] arr = {4,5,6,7,0,1,2};
         int target = 0;
         int ans = Binary2(arr,target);
        System.out.println(ans);
    }

    static int [] Basic(int [] arr, int target){
        int [] arr2 = {-1,-1};
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
               resultList.add(i);
            }
        }
        int [] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++){
            result [i] = resultList.get(i);
        }

        if (result.length > 0 ){
            return result;
        }else {
            return arr2;
        }

    }

    static int Binary(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            int mid = (start + end) / 2;

            if (arr[mid] > target){
                end = mid -1;
            }

            else if (arr[mid] < target){
                start = mid + 1;
            }

            else return mid;
        }

        return -1;
    }



    static int Binary2(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            int mid = (start + end) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[start] <= arr[mid]){
                    if (target >= arr[start] && target < arr[mid]){
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
            }
            else {
                if (target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

        }

        return -1;
    }


}

