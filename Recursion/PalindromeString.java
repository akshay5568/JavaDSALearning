package Recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str= "mojm";
        boolean ans = isPalin(str,0,str.length()-1);
        System.out.println(ans);
    }

    static boolean isPalin(String str,int i,int j){
        if (i >= j){
            return true;
        }
        if (str.charAt(i) != str.charAt(j)){
            return false;
        }
        return isPalin(str,++i,--j);
    }
}
