package Arrays;

public class AddDigits {
    public static void main(String[] args) {
        int num = 199;
        int ans = addDigits(num);
        System.out.println(ans);
    }

    static int addDigits(int num) {
        while(num > 9){
            int ans = 0;
            while(num != 0){
                ans += num % 10;
                num = num / 10;
            }
            num = ans;
        }
        return num;
    }
}
