package Recursion;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 45;
        boolean ans= isPowerOfThree(n);
        System.out.println(ans);
    }

    static boolean isPowerOfThree(int n) {
         if (n<=1) return n==1;
        return n % 3 == 0 && isPowerOfThree(n/3);
    }
}
