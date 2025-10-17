package String;

public class LongPressedNameString {
    public static void main(String[] args) {
            String name = "alex";
            String Name2 = "aaleex";
            boolean ans = isLongPressedName(name,Name2);
        System.out.println(ans);

    }

    static boolean isLongPressedName(String name, String typed) {
            int i = 0;
            int j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                // long pressed character
                j++;
            } else {
                // mismatch
                return false;
            }
        }
    return i == name.length();
    }
}
