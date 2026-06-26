package Twopointer;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        boolean ans = isHappy(2);
        System.out.println(ans);
    }

    static boolean isHappy(int n) {
        HashSet <Integer> set = new HashSet<>();
        while(true){
            n = happy(n);
            if(n == 1) return true;
            if(set.contains(n)) return false;
            set.add(n);
        }
    }

    static int happy(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }
}
