package Arrays;

public class MaximumAvrageSubArraysSum {
    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        double ans = findMaxAverage(arr,2);
        System.out.println(ans);
    }

    static double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        for(int i=0; i<nums.length; i++){
            double temp = 0;
            int count = 0;
            for(int j=i; j<nums.length; j++){
                if(count != k){
                    temp += nums[j];
                    count++;
                }else{
                    break;
                }
            }
            if (count == k){
                temp = temp / k;
                ans = Math.max(temp,ans);
            }
        }
        return ans;
    }

}
