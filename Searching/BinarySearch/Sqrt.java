package Searching.BinarySearch;

public class Sqrt {
    public static void main(String[] args) {

    }
    static int mySqrt(int x) {
        if(x < 2) return x;
        int start = 2;
        int end = x / 2;
        while(end >= start){
            int mid = (start + end) / 2;
            if((mid * mid) == x){
                return mid;
            }else if((long)mid * mid < (long)x){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        return Math.round(end);
    }
}
