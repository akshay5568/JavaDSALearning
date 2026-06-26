package String;

public class MergeStringAlternatvily {
    public static void main(String[] args) {

    }

    static String mergeAlternately(String word1, String word2) {
        int i =0;
        StringBuilder str = new StringBuilder();
        while(str.length() != (word1.length()+word2.length())){
            if(i < word1.length()){
                str.append(word1.charAt(i));
            }
            if(i < word2.length()){
                str.append(word2.charAt(i));
            }
            i++;
        }
        return String.valueOf(str);
    }
}
