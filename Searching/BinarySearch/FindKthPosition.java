package Searching.BinarySearch;

public class FindKthPosition {
    public static void main(String[] args) {
        int ans = findKthPositive(new int[]{2,3,4,7,11},5);
        System.out.println(ans);
    }

    static int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k) k++; else break;
        }
        return k;
    }
}
