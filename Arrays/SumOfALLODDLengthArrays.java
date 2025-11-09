package Arrays;

public class SumOfALLODDLengthArrays {
    public static void main(String[] args) {
        int [] arr = {1,4,2,5,3};
        int ans = sumOddLengthSubarrays(arr);
        System.out.println(ans);
    }

    static int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<=arr.length; j++){
                if((j - i) % 2 != 0){
                    for(int k=i; k<j; k++){
                        ans += arr[k];
                    }
                }
            }
        }
        return ans;
    }
}
