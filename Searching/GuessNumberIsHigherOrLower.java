package Searching;

public class GuessNumberIsHigherOrLower {
    public static void main(String[] args) {

    }


    static int guess(int a){
        return a;
    }
    static int guessNumber(int n) {
        long i = 1;
        while(n >= i){
            int mid = (int)((i + n) / 2);
            int guss = guess(mid);
            if(guss == 0) return mid;
            else if(guss == -1) n = mid - 1;
            else i = mid + 1;
        }
        return -1;
    }
}
