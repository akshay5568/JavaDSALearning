package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
       int arr [] = {1,3,4,5,6,7,10};
       int target = 9;
//       int ans = CelingNumber(arr, target);
        int ans = BinaryCelling(arr,target);
       System.out.println(ans);

    }


    static int BinarySearch(int[] arr, int target ) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAcending = arr[0] < arr[end];

        while (start <= end){
            int mid = (start + end) / 2;

            if (isAcending){
                if (target > arr[mid]){
                    start = mid + 1;
                }

                else if (target < arr[mid]) {
                    end = mid - 1;
                }

                else return mid;
            }
            else {
                if (target < arr[mid]){
                    start = mid + 1;
                }

                else if (target > arr[mid]) {
                    end = mid - 1;
                }

                else return mid;
            }

        }
        return -1;
    }

    static int CelingNumber(int [] arr, int target){
       int lastAns = 0;
        for (int i =0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
            if (arr[i] > target){
                return i;
            }
            else {
                lastAns = i + 1;
            }
        }
        return lastAns;
    }


    static int BinaryCelling (int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + end / 2;

            if (arr[mid] > target){
                end  = mid - 1;
            }

            else if (arr[mid] < target){
                start = mid + 1;
            }

           else return mid;
        }
        return start;
    }

}
