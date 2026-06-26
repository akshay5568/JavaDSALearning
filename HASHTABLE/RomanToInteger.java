package HASHTABLE;

import java.util.Hashtable;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int ans = romanToInt(s);
        System.out.println(ans);
    }

    static int romanToInt(String s) {
        Hashtable<Character,Integer> ht = new Hashtable<>();
        char [] arr = {'I','V','X','L','C','D','M'};
        int  [] num = {1,5,10,50,100,500,1000};

        for(int i=0; i<arr.length; i++){
            ht.put(arr[i],num[i]);
        }
        System.out.println(ht);
        int total = 0;
        for(int i=0; i<=s.length()-1;i++){
            if(i+1 < s.length() && ht.get(s.charAt(i)) < ht.get(s.charAt(i+1))){
                total += ht.get(s.charAt(i+1)) - ht.get(s.charAt(i));
                i += 1;
            }else{
                total += ht.get(s.charAt(i));
            }
        }
        return total;
    }
}
