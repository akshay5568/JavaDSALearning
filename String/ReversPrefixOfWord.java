package String;

public class ReversPrefixOfWord {
    public static void main(String[] args) {
         String str = "abcd";
         String ans = reversePrefix(str,'z');
        System.out.println(ans);
    }

    static String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();
        int index = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                str.append(word.charAt(i));
                index = i;
                break;
            }
            str.append(word.charAt(i));
        }
        if(index == 0) return word;
        String restString = word.substring(index+1);

        StringBuilder rString = reversString(str);

        return rString + restString;
    }

    static StringBuilder reversString(StringBuilder str){
        int count = str.length()-1;
        int j = str.length() - 1;
        StringBuilder ans = new StringBuilder();
        while(count != -1){
            ans.append(str.charAt(j));
            count--;
            j--;
        }
        return ans;
    }
}
