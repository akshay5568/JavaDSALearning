package Strings;

public class ShuffleString {
    public static void main(String[] args) {
            int []nums = {0,1,2};
            String s = "abc";
            String ans = restoreString(s,nums);
        System.out.println(ans);

    }

    static String restoreString(String s, int[] indices) {
            String ans = "";
            for (int i =0; i<indices.length; i++){
                for (int j=0; j<indices.length; j++){
                    if (indices[j] == i){
                        ans += String.valueOf(s.charAt(j));
                    }
                }
            }
            return ans;
    }

}
