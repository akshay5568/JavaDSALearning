package Arrays;

public class RearrengArrayElement {
    public static void main(String[] args) {

    }

    static int[] rearrangeArray(int[] nums) {
        int [] ans = new int[nums.length];
        int pIndex = 0;
        int nIndex = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 0){
                ans[pIndex] = nums[i];
                pIndex = pIndex + 2;
            }else{
                ans[nIndex] = nums[i];
                nIndex = nIndex + 2;
            }
        }
        return ans;
    }
}
