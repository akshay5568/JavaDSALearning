package String;

public class CheckifAllAppearsBeforeAll {
    public static void main(String[] args) {
            boolean ans = checkString("aaabbb");
        System.out.println(ans);
    }

    static boolean checkString(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == 'b' && s.charAt(i) == 'a') {
                return false;
            }
        }
        return true;
    }
}
