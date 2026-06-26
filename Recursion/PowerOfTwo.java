package Recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
    }

    static boolean isPowerOfTwo(int n) {
            if(n == 1){
                return true;
            } else if (n < 1 || n % 2 != 0) {
                return false;
            }
        return isPowerOfTwo(n / 2);
    }

}
