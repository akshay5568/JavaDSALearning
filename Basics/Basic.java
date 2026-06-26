package Basics;

public class Basic {
    public static void main(String[] args) {
        String s = "([}]";
        boolean ans = isValid(s);
        System.out.println(ans);
    }

        static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        char a = charArray[0];
        System.out.println(charArray);
        char b = charArray[charArray.length-1];
        System.out.println(b);
        if(a == b || charArray[0] == a && charArray[charArray.length-1] == b){
             return true;
        }
        return false;
    }
}
