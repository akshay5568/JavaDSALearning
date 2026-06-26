package String;

public class SpliteAStringIntoBalancedString {
    public static void main(String[] args) {

    }

    static int balancedStringSplit(String s) {
        int count = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            count += s.charAt(i) == 'L' ? 1 : -1;
            if(count == 0) ans++;
        }
        return ans;
    }
}
