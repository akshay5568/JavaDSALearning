package Basics;

public class TotalWavyvinessOfNumbersInRange {
    public static void main(String[] args) {
        System.out.println(totalWaviness(9972,9999));
    }

    static int totalWaviness(int num1, int num2) {
        int sum = 0;
        for(int i=num1; i<=num2; i++){
            sum += isWavyORVally(String.valueOf(i));
        }
        return sum;
    }

    static int isWavyORVally(String str){
        if (str.length() < 3) return 0;
        int sum = 0;
        for (int i=1; i<str.length()-1; i++){
            int left = str.charAt(i-1) - '0';
            int mid = str.charAt(i) - '0';
            int right = str.charAt(i+1) - '0';
            if (left > mid && mid < right || left < mid && mid > right) sum++;
        }
        return sum;
    }
}
