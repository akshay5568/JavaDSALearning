package String;

public class AppearAsSubString {
    public static void main(String[] args) {
         String [] str= {"a","b","c"};
         int ans = numOfStrings(str,"aaaaabbbbb");
        System.out.println(ans);
    }

    static int numOfStrings(String[] patterns, String word) {
         int ans = 0;
            for (int i=0;i<patterns.length; i++){
                int sub = word.indexOf(patterns[i]);
                if(sub != -1){
                    ans++;
                }
            }
        return ans;
    }
}
