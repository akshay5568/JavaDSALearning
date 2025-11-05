package String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class KeyboradRow {
    public static void main(String[] args) {
        String [] words= {"adsdf","sfd"};
        String[]  ans = findWords(words);
        System.out.println(Arrays.toString(ans));
    }

    static String[] findWords(String[] words) {
        String [] qwert = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        ArrayList ans = new ArrayList();
        for (int i=0; i<qwert.length; i++){
            for(int j=0; j<words.length; j++){
                boolean isTrue = true;
                for(int c=0; c<words[j].length(); c++){
                      String cr = String.valueOf(words[j].toLowerCase().charAt(c));
                     if (!qwert[i].contains(cr)){
                         isTrue  = false;
                     }
                }
                if (isTrue){
                    ans.add(words[j]);
                }
            }
        }
        String anss[] = new String[ans.size()];
        for(int h=0; h<ans.size(); h++){
             anss[h] = ans.get(h).toString();
        }
        return anss;
    }
}
