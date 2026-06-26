package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
            String  [] strs = {"ab","aa"};
            String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }

    static String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        boolean isValid = true;
        for(int i=0; i<strs[0].length(); i++){

            char temp = strs[0].charAt(i);

            for(int j =1; j<strs.length; j++){
               if(i < strs[j].length()){
                   if(strs[j].charAt(i) != temp){
                       if(str.isEmpty()) {
                           return "";
                       }else{
                           return String.valueOf(str);
                       }
                   }
               }else {
                   isValid = false;
               }

            }
            if(isValid) str.append(temp);
        }
        return String.valueOf(str);
    }
}
