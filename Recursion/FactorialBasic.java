package Recursion;

public class FactorialBasic {
    public static void main(String[] args) {
        int n = 5;
        int ans = factorialBasic(n);
        System.out.println(ans);
    }

    static int factorialBasic(int n){
        if (n == 0){
            return 1;
        }
        return n * factorialBasic(n-1);
    }
}
