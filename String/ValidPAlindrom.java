package String;

public class ValidPAlindrom {
    public static void main(String[] args) {
        boolean ans = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(ans);
    }

    static boolean isPalindrome(String s) {
        String newStr = s.replaceAll("[^\\p{L}\\p{N}\\s]", "");
        newStr = newStr.replace(" ", "");
        newStr = newStr.toLowerCase();
        int start = 0;
        int end = newStr.length() - 1;
        while(end >= start){
            if(newStr.charAt(start) != newStr.charAt(end)){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}
