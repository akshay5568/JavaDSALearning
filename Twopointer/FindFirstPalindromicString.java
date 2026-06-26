package Twopointer;

public class FindFirstPalindromicString {
    public static void main(String[] args) {

    }

    static String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            boolean isP = isPalin(words[i]);
            if(isP) return words[i];
        }
        return "";
    }

    static boolean isPalin(String str){
        int i = 0;
        int e = str.length()-1;
        while(e >=i ){
            if(str.charAt(i) != str.charAt(e)){
                return false;
            }
            i++;
            e--;
        }
        return true;
    }
}
