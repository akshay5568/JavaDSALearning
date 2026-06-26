package String;

import java.util.List;

public class StringIsAcronymOrNot {
    public static void main(String[] args) {

    }
    static boolean isAcronym(List<String> words, String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<words.size(); i++){
            String temp = String.valueOf(words.get(i).charAt(0));
            str.append(temp);
        }
        if(s.equals(String.valueOf(str))){
            return true;
        }
        return false;
    }
}
