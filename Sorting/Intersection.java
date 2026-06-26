package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int [] nums = {1,2,2,1};
        int [] nums1 = {2,2};
        int[] ans = Intersection2(nums, nums1);
        System.out.print(Arrays.toString(ans));
    }

    static int[] Intersection2(int [] nums, int []nums1){
            ArrayList <Integer> List = new ArrayList<>();
            boolean[] visited = new boolean[nums1.length];
            for(int i = 0; i<nums.length; i++){
                for(int j=0; j<nums1.length; j++){
                    if (nums[i] == nums1[j]&& !visited[j]) {
                        List.add(nums[i]); 
                        visited[j] = true;
                        break;
                    }
                }
            }


            int [] temp = new int[List.size()];
            for(int k=0; k<List.size(); k++){
                temp[k] = List.get(k);
            }

        return temp;
    }
}
