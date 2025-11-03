package Arrays;

import java.util.ArrayList;

public class DecompressLengthEncoded {
    public static void main(String[] args) {

    }

    static int[] decompressRLElist(int[] nums) {
        ArrayList list = new ArrayList();
        for(int i=0; i<nums.length; i=i+2){
            int freq = nums[i];
            int value = nums[i+1];
            for(int k=0; k<freq; k++){
                list.add(value);
            }
        }

        int [] ans = new int [list.size()];
        for(int j=0; j<list.size(); j++){
            ans[j] = (int)(list.get(j));
        }
        return ans;
    }
}
