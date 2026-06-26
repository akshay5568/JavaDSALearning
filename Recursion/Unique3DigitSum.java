package Recursion;

import java.util.HashSet;
import java.util.Set;

public class Unique3DigitSum {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4};
        System.out.println(totalNumbers(arr));
    }

    //This is the brute force approach of this problem still I have to solve this at better Time and Complexity.
    //Because we are using 3 nested for loops.
//    public static int totalNumbers(int[] digits) {
//        Set<Integer> set = new HashSet<>();
//        for(int i=0; i<digits.length; i++){
//            for(int j=0; j<digits.length; j++){
//                for(int k=0; k<digits.length; k++){
//                    int temp = 0;
//                    if (digits[i] != 0){
//                        temp = digits[i];
//                        temp = temp * 10 + digits[j];
//                        temp = temp * 10 + digits[k];
//                    }
//                    String str = String.valueOf(temp);
//                    if(str.length() == 3){
//                        if(i != k  && j != i && k != j  && temp % 2 ==0){
//                            set.add(temp);
//                        }
//                    }
//                }
//            }
//        }
//        return set.size();
//    }

    public static int totalNumbers(int [] digits){
        Set<Integer> set = new HashSet<>();
        return helper(digits,0,0,0,set);
    }

    public static int helper(int [] digits, int a,int b,int c, Set<Integer> set){
         int sum = 0;
         if (a == digits.length || b == digits.length || c == digits.length) return sum;
         int one = helper(digits,a+1,0,0,set);
         int two = helper(digits,0,b+1,0,set);
         int three = helper(digits,0,0,c+1,set);
         if(one != 0){
             sum = one;
             sum = sum * 10 + two;
             sum = sum * 10 + three;
         }
         if (a != c && c != b && a != b){
             String str = String.valueOf(sum);
             if (str.length() == 3) set.add(sum);
         }
         return sum;
    }
}
