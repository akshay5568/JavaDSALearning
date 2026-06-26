package Twopointer;

public class FindIndicesWithIndexValue {
    public static void main(String[] args) {

    }

    static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    //This is Two pointer method that i used for this problem but this is also solve this problem in worst case N2;
    static int[] findIndices2(int[] nums, int indexDifference, int valueDifference) {
        int l = 0;
        int r= 0;
        while(nums.length > r){
            if(Math.abs(r - l) >= indexDifference && Math.abs(nums[r] - nums[l]) >= valueDifference){
                return new int []{r,l};
            }

            if(r == nums.length-1){
                l++;
                r = l;
                continue;
            }
            r++;
        }
        return new int[]{-1,-1};
    }
}
