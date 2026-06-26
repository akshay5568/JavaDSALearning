package Arrays;

public class SubtractProductSum {
    public static void main(String[] args) {
        int x = 234;
        int ans = subtractProductAndSum(x);
        System.out.println(ans);
    }
    static int subtractProductAndSum(int n) {
        int multiply = 1;
        int sum = 0;
        int x = n;
        while(x != 0){
            multiply *= x % 10;
            x = x / 10;
        }
        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }
        return multiply - sum;
    }
}
