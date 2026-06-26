package String;

public class CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {

    }

    static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
