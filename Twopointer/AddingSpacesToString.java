package Twopointer;

public class AddingSpacesToString {
    public static void main(String[] args) {
        String str = "LeetcodeHelpsMeLearn";
        String ans = addSpaces(str, new int[]{8,13,15});
        System.out.println(ans);
    }

    static String addSpaces(String s, int[] spaces) {
        StringBuilder st = new StringBuilder(s);
        int l = 0;
        int r = 0;
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<spaces.length; i++){
            r = spaces[i];
            if(i == 0){
                l = 0;
            }else{
                l = spaces[i-1];
            }
            String temp = st.substring(l,r);
            answer.append(temp).append(" ");
        }
        answer.append(st, r, st.length());
        return answer.toString();
    }
}
