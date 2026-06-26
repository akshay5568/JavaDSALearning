package Searching.BinarySearch;

public class FindMinimumSortedn {
    public static void main(String[] args) {
         int ans = findMin(new int[]{5,6,7,8,1,2,3,4});
        System.out.println(ans);
    }

    static int findMin(int [] arr){
         int start = 0;
         int end = arr.length-1;

         while(end >= start){
              int mid = start + (end - start) / 2;
              if (arr[start] < arr[end]){
                   return arr[start];
              }
              if(arr[mid-1] > arr[mid]){
                  return arr[mid];
              }else if(arr[start] > arr[mid]){
                   end = mid-1;
              }else {
                  start = mid+1;
              }
         }
         return -1;
    }
}
