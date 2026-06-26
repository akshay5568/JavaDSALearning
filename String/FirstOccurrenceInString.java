package String;

public class FirstOccurrenceInString {
    public static void main(String[] args) {
        String str = "sadbutsad";
        String needle = "sad";
        int ans = strStr(str,needle);
        System.out.println(ans);
    }

    static int strStr(String haystack, String needle) {

            for (int  i=0; i<haystack.length(); i++){
                     if (haystack.startsWith(needle,i)){
                         return i;
                     }
        }return -1;
    }
}
