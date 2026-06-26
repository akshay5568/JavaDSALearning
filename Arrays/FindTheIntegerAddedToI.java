package Arrays;

public class FindTheIntegerAddedToI {
    public static void main(String[] args) {

    }

    static int addedInteger(int[] nums1, int[] nums2) {
        int right = 0;
        int left = 0;
        for(int i : nums1){
            left += i;
        }

        for(int j : nums2){
            right += j;
        }

        if(left > right){
            return -(left - right) / nums2.length;
        }
        return (right - left) / nums2.length;
    }
}
