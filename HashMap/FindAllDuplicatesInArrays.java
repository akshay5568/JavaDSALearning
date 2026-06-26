package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesInArrays {
    public static void main(String[] args) {

    }
        public static List<Integer> findDuplicates(int[] nums) {
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
                if(entry.getValue() > 1){
                    ans.add(entry.getKey());
                }
            }
            return ans;
        }

}
