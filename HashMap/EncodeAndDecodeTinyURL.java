package HashMap;

import java.util.ArrayList;
import java.util.Arrays;

public class EncodeAndDecodeTinyURL {
    public static void main(String[] args) {
        String url = "https://leetcode.com/problems/design-tinyurl";
        String[] arr = url.split("/");
        System.out.println(Arrays.toString(arr));


        ArrayList<ArrayList<Integer>> s = new ArrayList<>();


        //Encode
        for (int i = 3; i < arr.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < arr[i].length(); j++) {
                list.add((int) arr[i].charAt(j));
            }
            s.add(list);
        }
        StringBuilder encodeUrl = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            encodeUrl.append(arr[i]);
        }
        encodeUrl.append("//");
        encodeUrl.append("aditya.com/");

        StringBuilder count = new StringBuilder();
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.get(i).size(); j++) {
                count.append(s.get(i).get(j));
            }
            break;
        }
        encodeUrl.append(count);
        System.out.println("Encode URL:" + " " + encodeUrl);


        //Decode
        StringBuilder decode = new StringBuilder();

        for (int i = 0; i <= 2; i++) {
            if (i == 1) {
                decode.append("//");
            } else {
                decode.append(arr[i]);
            }
        }
        decode.append("/");

        for (int i = 0; i < s.size(); i++) {
            StringBuilder st = new StringBuilder();
            for (int j = 0; j < s.get(i).size(); j++) {
                int temp = s.get(i).get(j);
                char ch = (char) temp;
                if (Character.isLetter(ch)) {
                    st.append(ch);
                } else {
                    st.append(ch);
                }
            }
            decode.append(st);
            if (s.size()-1 != i){
                decode.append("/");
            }
        }

        System.out.println("Decoded URL :" + " " + decode);


    }
}
