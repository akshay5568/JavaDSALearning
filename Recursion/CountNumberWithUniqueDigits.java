package Recursion;

import java.util.HashSet;
import java.util.Set;

public class CountNumberWithUniqueDigits {
    public static void main(String[] args) {

    }

    static int countNumbersWithUniqueDigits(int n) {
        int end = (int)(Math.pow(10,n));
        int count = 0;
        for(int i=0; i<end; i++){
            Set<Integer> set = new HashSet<>();
            int temp = i;
            while(temp != 0)
            {
                int j = temp % 10;
                if(set.contains(j)){
                    count++;
                    break;
                }else {
                    set.add(j);
                }
                temp = temp / 10;
            }
        }
        return end - count;
    }
}
