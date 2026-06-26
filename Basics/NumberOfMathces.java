package Basics;

public class NumberOfMathces {
    public static void main(String[] args) {
        int n = 7;
        int ans = numberOfMatches(n);
        System.out.println(ans);
    }

    static int numberOfMatches(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 != 0) {
                int temp = n / 2;
                n = n - temp;
                count += temp;
            } else {
                count += n / 2;
                n = n / 2;
            }
        }
        return count;
    }
}
