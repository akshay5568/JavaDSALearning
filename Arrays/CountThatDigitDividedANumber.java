package Arrays;

public class CountThatDigitDividedANumber {
    public static void main(String[] args) {

    }

    static int countDigits(int num) {
        int ans = 0;
        int nums = num;

        while(nums != 0){
            int val = nums % 10;
            nums = nums / 10;
            if(num % val == 0) ans++;
        }
        return ans;
    }
}
