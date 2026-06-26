package Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 123;
        int ans = reverseNumber(n,0);
        System.out.println(ans);
    }


    //This method was using String for helper but that was not effeicent.
    static String reverseNumber(int n , String ans){
        if (n <= 0) return ans;
        ans += String.valueOf(n%10);
        return reverseNumber(n/10,ans);
    }

    //This method is good if we compare to String method because we used INT, therefore complexity is slightly higher
    // Because in JAVA String is inmutable;
    static int reverseNumber(int n, int ans){
        if (n <= 0) return ans;
        ans = ans * 10 + n % 10;
        return reverseNumber(n/10,ans);
    }
}
