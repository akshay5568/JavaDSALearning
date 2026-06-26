package Arrays;

public class CountGoodTriplets {
    public static void main(String[] args) {

    }

    static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int p=j+1; p<arr.length; p++){
                    if(0 <= i && i < j && j < p && p < arr.length && Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[p]) <= b && Math.abs(arr[i] - arr[p]) <= c){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
