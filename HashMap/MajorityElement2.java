package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static void main(String[] args) {

    }

    // public static List<Integer> majorityElement(int[] nums) {
    //       List<Integer> ans = new ArrayList<>();
    //       for(int i=0; i<nums.length; i++){
    //         int count = 0;
    //         for(int j=0; j<nums.length; j++){
    //             if(nums[i] == nums[j]){
    //                 count++;
    //             }
    //         }
    //         if(count > nums.length/3){
    //             if(!ans.contains(nums[i])) ans.add(nums[i]);
    //         };
    //       }
    // return ans;
    // }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
                int temp = hm.get(nums[i]);
                hm.put(nums[i],++temp);
            }
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > nums.length/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
