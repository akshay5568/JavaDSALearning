package Arrays;

public class FindCommonElement {
    public static void main(String[] args) {

    }

    static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int answer1 = 0;
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    answer1++;
                    break;
                }
            }
        }

        int answer2 = 0;
        for(int j=0; j<nums2.length; j++){
            for(int i=0; i<nums1.length; i++){
                if(nums2[j] == nums1[i]){
                    answer2++;
                    break;
                }
            }
        }

        return new int[]{answer1,answer2};
    }
}
