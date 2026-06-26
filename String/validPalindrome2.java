package String;

public class validPalindrome2 {
    public static void main(String[] args) {
        boolean ans = validPalindrome("hbakab");
        System.out.println(ans);
    }

    static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                // If mismatch, try removing one char from either side
                String skipLeft = removeChar(s, start);
                String skipRight = removeChar(s, end);

                return isPalindrome(skipLeft) || isPalindrome(skipRight);
            }
            start++;
            end--;
        }

        return true; // Already palindrome
    }

    // Removes character at given index
    static String removeChar(String str, int index) {
        return str.substring(0, index) + str.substring(index + 1);
    }

    // Checks if string is palindrome
    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
