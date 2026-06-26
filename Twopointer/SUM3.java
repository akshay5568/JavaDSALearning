package Twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SUM3 {
    public static void main(String[] args){
        int [] arr= {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum2(arr);
        System.out.println(ans);
    }


    //This is my brute-force approch that used to solve this problem but it us was not efficeint so therefore i had solve Two pointer and sorting.
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if((i != j && j != k && i != k) && (nums[i] + nums[j] + nums[k]) == 0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        if (!list.contains(temp)){
                            list.add(temp);
                        }
                    }
                }
            }
        }
        return list;
    }

    //I tried this approch also to solve 3SUM but this could work well.
    static List<List<Integer>> threeSum1(int [] nums){
        List<List<Integer>> list = new ArrayList<>();
        int r = 0;
        int l = nums.length-1;
        Arrays.sort(nums);
        int i = r+1;
        while(i != l){
            if ((nums[r] + nums[i] + nums[l]) == 0){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[r]);
                temp.add(nums[i]);
                temp.add(nums[l]);
                list.add(temp);
            }
            if (i == l-1){
                r++;
                i = r+1;
                continue;
            }
            System.out.println(list);
            i++;
        }
        return list;
    }


    //Finally this approach is worked to solve completily 3SUM problem.
    static List<List<Integer>> threeSum2(int [] nums){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int r = i + 1;
            int l = nums.length-1;


            while (r < l){
                int total = nums[i]+nums[r]+nums[l];
                if (total > 0){
                    l--;
                }else if (total < 0){
                    r++;
                }else{
                    list.add(Arrays.asList(nums[i],nums[r],nums[l]));
                    r++;

                    while(l > r && nums[r] == nums[r-1]){
                        r++;
                    }
                }
            }

        }
        return list;
    }
}
