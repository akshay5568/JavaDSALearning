package SlidingWindow;

import java.util.HashMap;

public class NumberOfSubStringContainingAllThreeCharacter {
    public static void main(String[] args) {
        int ans = numberOfSubstrings3("abcabc");
        System.out.println(ans);
    }


    static int numberOfSubstrings3(String s) {
        int count =0; int r =0; int l =0;
        int [] fre = new int[3];

        while(r < s.length()){
            char a = s.charAt(r);
            fre[a - 'a']++;

            while(subString(fre)){
                count += s.length() - r;
                char temp = s.charAt(l);
                fre[temp - 'a']--;
                l++;
            }
            r++;
        }
        return count;
    }

    static boolean subString(int [] fre){
        return fre[0] > 0 && fre[1] > 0 && fre[2] > 0;
    }










    static int numberOfSubstrings2(String s) {
        int count =0; int r =0; int l =0;
        HashMap<Character,Integer> hm = new HashMap<>();
        StringBuilder str = new StringBuilder();

        while(l != s.length()-1){
            hm.put(s.charAt(r),r);
            boolean isValidSub = subString(s.substring(l,r+1));
            if(isValidSub) count++;

            if(r >= s.length()-1){
                l++;
                if(hm.get(s.charAt(l)) <= l) r = l;
                else r = hm.get(s.charAt(l)) - 1;
                continue;
            }
            r++;
        }
        return count;
    }

    static boolean subString(String str){
        String [] ch = {"a","b","c"};
        for(int i=0; i<ch.length; i++){
            if(!str.contains(ch[i])) return false;
        }
        return true;
    }























    static int numberOfSubstrings1(String s) {
        String [] cg = {"a","b","c"};
        int count = 0;
        int l=0;
        int r=2;
        while(l < s.length()){
            if(r == s.length()-1){
                l++;
            }
            boolean isTrue = true;
            String str = s.substring(l,r+1);
            for(int i=0; i<cg.length; i++){
                if(!str.contains(cg[i])){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue){
                count++;
            }
            if(r != s.length()-1){
                r++;
            }
        }
        return count;
    }

    static int numberOfSubstrings(String s){
        int count = 0;
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<s.length(); j++){
                 boolean isSub = subs(s.substring(i,j+1));
                 if (isSub) count++;
            }
        }
    return count;
    }

    static boolean subs(String str){
        boolean isTrue = true;
        String [] ch = {"a","b","c"};
        for (String s : ch) {
            if (!str.contains(s)) {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}
