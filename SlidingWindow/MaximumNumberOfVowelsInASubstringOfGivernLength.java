package SlidingWindow;

import java.util.Map;

public class MaximumNumberOfVowelsInASubstringOfGivernLength {
    public static void main(String[] args) {
        String str = "abciiidef";
        int ans = maxVowels(str,3);
        System.out.println(ans);
    }


    static int maxVowels(String s, int k){
        int maxVowels = 0;
        int vowels = 0;
        int l = 0;

        for (int r =0; r<s.length(); r++){
            if (isVowel(s.charAt(r))) vowels++;
            if ((r - l+1) == k){
                maxVowels = Math.max(maxVowels,vowels);
                if (isVowel(s.charAt(l)))vowels--;
                l++;
            }
        }
        return maxVowels;
    }

    static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }





















//    static int maxVowels(String s, int k) {
//        int r = k-1;
//        int l = 0;
//        int maxCount = 0;
//        while(r < s.length()){
//            String str = s.substring(l,r+1);
//            int count = vowelsCount(str);
//            maxCount = Math.max(count,maxCount);
//            r++;
//            l++;
//        }
//        return maxCount;
//    }
//
//    static int vowelsCount(String str){
//        String ch = "aeiou";
//        int count = 0;
//        for(int i=0; i<str.length(); i++){
//            if(ch.contains(String.valueOf(str.charAt(i)))) count++;
//        }
//        return count;
//    }
}
