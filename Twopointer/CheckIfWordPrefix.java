package Twopointer;

public class CheckIfWordPrefix {
    public static void main(String[] args) {
        String s = "this problem is an easy problem";
        int ans = isPrefixOfWord(s,"pro");
        System.out.println(ans);
    }

    static int isPrefixOfWord(String sentence, String searchWord) {
        String [] st = sentence.split(" ");
        for(int i=0; i<st.length; i++){
            if(st[i].length() >= searchWord.length()){
                boolean isTrue = true;
                for(int j=0; j<searchWord.length(); j++){
                    if(searchWord.charAt(j) != st[i].charAt(j)){
                        isTrue = false;
                        break;
                    }
                }
                if (isTrue) return i+1;
            }
        }
        return -1;
    }
}
