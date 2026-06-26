package String;

public class CountPrefixes {
    public static void main(String[] args) {
       String [] words = {"a","a"};
       String s = "aa";
       int ans = countPrefixes(words,s);
        System.out.println(ans);
    }

    static int countPrefixes(String[] words, String s) {
        int count = 0;
                for (int i=0; i<words.length; i++){
                       if(s.startsWith(words[i])) {
                           count++;
                       }
                }return count;
    }
}
