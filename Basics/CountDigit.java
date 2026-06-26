package Basics;

public class CountDigit {
    public static void main(String[] args) {
        int nums = 259;
        int ans= countDigi(nums);
        System.out.println(ans);
    }


    static int countDigi(int num){
//        String value = String.valueOf(num);
//        int ans = value.length();
        int counter = 0;
        while (num != 0){
            num = num/10;
            counter++;
        }
        return counter;
    }
}
