package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] nusm = {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(nusm);
        System.out.println(ans);
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        return max;
    }
}
