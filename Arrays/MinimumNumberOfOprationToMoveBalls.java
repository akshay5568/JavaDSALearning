package Arrays;

import java.util.Arrays;

public class MinimumNumberOfOprationToMoveBalls {
    public static void main(String[] args) {
        int [] ans = minOperations("110");
        System.out.println(Arrays.toString(ans));
    }

    static int[] minOperations(String boxes) {

        int [] ans = new int[boxes.length()];
        for(int i=0; i<boxes.length(); i++){
            if(boxes.charAt(i) == '1'){
                for(int j=0; j<boxes.length(); j++){
                    ans[j] += Math.abs(i - j);
                }
            }
        }
        return ans;
    }
}
