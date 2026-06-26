package SlidingWindow;

public class NumberOfSubStringContainingAllThreeCharacter {
    public static void main(String[] args) {
        int ans = numberOfSubstrings("abcabc");
        System.out.println(ans);
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
