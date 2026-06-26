package Basics;

public class IsPowerOfFoure {
    public static void main(String[] args) {
        boolean ans = isPowerOfFour(16);
        System.out.println(ans);
    }

    static boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if(n < 0 || n % 4 != 0) return false;
        return isPowerOfFour(n / 4);
    }
}
