package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSquares2 {
    public static void main(String[] args) {

    }


    public static List<List<String>> wordSquares(String[] words) {
        String [] temp = words.clone();
        Arrays.sort(temp);
        List<List<String>>  ans = new ArrayList<>();

        for (int a=0; a<temp.length; a++){
            for (int b=0; b<temp.length; b++){
                if (a != b && temp[a].charAt(0) == temp[b].charAt(0)){
                    for (int c=0; c<temp.length; c++){
                        if (c != a && c != b && temp[a].charAt(3) == temp[c].charAt(0)){
                            for (int d=0; d<temp.length; d++){
                                if (d != a && d != b && d != c && temp[d].charAt(0) == temp[b].charAt(3) && temp[d].charAt(3) == temp[c].charAt(3)){
                                    ans.add(Arrays.asList(temp[a],temp[b],temp[c],temp[d]));
                                }
                            }
                        }
                    }
                }
            }
        }

        return ans;
    }


}
