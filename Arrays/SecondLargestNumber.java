package Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int [] nums = {4,9,0,2,8,7,1};
        int ans = SecondLargest(nums);
        System.out.println(ans);
    }


    static int SecondLargest(int [] arr){
        int second = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max){
                second = max;
                max = arr[i];
            }
            else if (arr[i] > second){
                second = arr[i];
            }
        }
//        for(int j=0; j<arr.length; j++){
//             if (arr[j] > second && arr[j] != max){
//                 second = arr[j];
//             }
//        }
        return second;
    }

}
