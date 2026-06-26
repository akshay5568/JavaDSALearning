package Basics;

public class CountDigit {
    public static void main(String[] args) {
        int nums = 1342;
        int ans= RecusriveCountDigi(nums);
        System.out.println(ans);
    }


    static int countDigi(int num){
        int counter = 0;
        while (num != 0){
            num = num/10;
            counter++;
        }
        return counter;
    }

    static int RecusriveCountDigi(int num){
        if (num <= 0) return 0;
        int rem = num % 10;
        return RecusriveCountDigi(num / 10) + rem;
    }
}
