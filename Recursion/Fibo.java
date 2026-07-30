package Recursion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;

public class Fibo {
    public static void main(String[] args) {
        int ans = fibo2(4);
        System.out.println(ans);
    }

    static int fibo(int n){
         if (n <= 1){
             return n;
         }
         return fibo(n-1) + fibo(n-2);
    }


    static int fibo2(int n){
         HashMap<Integer,Integer> hm = new HashMap<>();
         int ans = fiboCalc(n,hm);
         System.out.println(ans);
         return ans;
    }

    static int fiboCalc(int num,HashMap<Integer,Integer> hm){
        if (num <= 1) return num;
        if (hm.containsKey(num)) {
           return hm.get(num);
        }
        int a = fiboCalc(num-1,hm);
        int b = fiboCalc(num-2,hm);
        int res = a + b;
        hm.put(num,res);
        System.out.println(hm);
        return res;
    }
}
