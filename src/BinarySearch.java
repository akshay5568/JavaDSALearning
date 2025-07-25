public class BinarySearch {
    public static void main(String[] args) {
//        int arr [] = {1,2,3,4,5,6,7};
        int [] arr = {7,6,5,4,3,2,1};
        int target = 3;
        int ans = BinarySearch(arr, target);
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
}
