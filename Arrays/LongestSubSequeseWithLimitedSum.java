package Arrays;

import java.util.Arrays;

public class LongestSubSequeseWithLimitedSum {
    public static void main(String[] args) {
        int [] arr = {4,5,2,1};
        int [] arr2 = {3,10,21};
        int [] ans = answerQueries(arr,arr2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] answerQueries(int[] nums, int[] queries) {
        int answer [] = new int [queries.length];
        int maxSum = 0;
        int index = 0;
        for(int i=0; i<queries.length; i++){
            int r = 0;
            int l = 0;
            int temp = 0;
            int count = 0;
            int count2 = 0;
            maxSum = 0;
            while(r < nums.length){
                count = r;
                if(queries[i] >= temp && maxSum < temp){
                    count2++;
                    maxSum = temp;
                }
                temp += nums[r];
                if(r == nums.length-1){
                    if(l == nums.length-1) {
                        r = count + 1;
                        l = r;
                        continue;
                    }
                    temp = temp - nums[l];
                    l++;
                    continue;
                }
                r++;
            }
            answer[index++] = count2;
        }
        return answer;
    }
}
