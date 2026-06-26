package Twopointer;

public class ScoreOfString {
    public static void main(String[] args) {

    }

    static int scoreOfString(String s) {
        int score = 0;
        int r = 1;
        int l = 0;
        while(r < s.length()){
            int total = (int)Math.abs(s.charAt(l) - s.charAt(r));
            score += total;
            r++;
            l++;
        }
        return score;
    }
}
