package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindTargetIndices {
    public static void main(String[] args) {

    }

    static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int j=0; j<nums.length; j++){
            if(nums[j] == target){
                list.add(j);
            }
        }

        return list;
    }

}
