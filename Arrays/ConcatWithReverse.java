package Arrays;

public class ConcatWithReverse {
    public static void main(String[] args) {

    }

    public int[] concatWithReverse(int[] nums) {
        int [] ans = new int [nums.length * 2];
        int index = 0;
        for(int i=0; i<nums.length; i++){
            index++;
            ans[i] = nums[i];
        }
        for(int i=nums.length-1; i>=0;i--){
            ans[index++] = nums[i];
        }
        return ans;
    }
}
