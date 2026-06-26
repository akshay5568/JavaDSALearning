package Recursion;

import Basics.CountDigit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeautifulArrangement {
    public static void main(String[] args) {
        int ans = countArrangement(3);
        System.out.println(ans);
    }

    static int count = 0;
    public static int countArrangement(int n) {
            beautifulBack(n,new boolean[n + 1],1);
            return count;
    }

    public static void beautifulBack(int n, boolean [] used, int element){
        if(element > n){
             count++;
             return;
        }
        for (int i=1; i<=n; i++){
            if (!used[i] && (element % i == 0 || i % element == 0)) {
                used[i] = true;
                beautifulBack(n, used, element + 1);
                used[i] = false;
            }
        }
    }




    //Before I was using this approach to solve this problem, like via generating all the permutation, but now I am checking while generating.
    public static boolean isArrangment(List<Integer> list){
        for(int i=1; i<=list.size(); i++){
            if (list.get(i-1) % i != 0 && i % list.get(i-1) != 0) {
                return false;
            };
        }
        return true;
    }
}
