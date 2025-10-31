package Arrays;

public class SmallesEqual {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int ans = smallestEqual(arr);
        System.out.println(ans);
    }

    static int smallestEqual(int[] nums) {
        for(int i=0; i<nums.length; i++){;
            if((i % 10) == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
