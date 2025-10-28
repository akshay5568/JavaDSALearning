package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        int [] ans = createTargetArray(arr,index);
        System.out.println(Arrays.toString(ans));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList list = new ArrayList();

        for(int i=0; i<nums.length; i++){
            list.add(index[i],nums[i]);
        }
       for(int j=0; j<list.size(); j++){
           nums[j] = (int) list.get(j);
       }

       return nums;
    }
}
