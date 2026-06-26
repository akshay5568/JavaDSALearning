package Twopointer;

public class RemoveDuplicatesFromSortedArrays {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,1,2,3,3};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
    static int removeDuplicates(int[] nums) {
        int l = 0;
        int count = 1;
        for(int r =1; r<nums.length; r++){
            if(nums[r-1] == nums[r]){
                count++;
            }else{
                count = 1;
            }

            if(count <= 2){
                l++;
                nums[l] = nums[r];
            }
        }
        return l+1;
    }
}
