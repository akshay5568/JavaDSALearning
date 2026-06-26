package Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int ans = binaryRec(arr,7,0,arr.length-1);
        System.out.println(ans);
    }

//    static int binaryRec(int [] arr, int target){
//           int start = 0;
//           int end = arr.length-1;
//           while(end >= start){
              // End  >= (I wrote = here because it will run until our end is not greater than start)
//               int mid = (start + end) / 2;
//               if (arr[mid] == target){
//                     return mid;
//               } else if (arr[mid] > target) {
//                   end = mid - 1;
//               }else {
//                   start = mid + 1;
//               }
//           }
//           return -1;
//    }

    static int binaryRec(int [] arr, int target, int start, int end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                  return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
                return binaryRec(arr, target,start,end);
            }else{
                start = mid + 1;
                return binaryRec(arr,target,start,end);
            }
    }
}
