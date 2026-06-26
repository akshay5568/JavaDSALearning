package Arrays;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};
        int [] ans  = nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] arr = new int[nums1.length];
        int index = 0;
        boolean isTrue = false;
        for(int i=0; i<nums1.length; i++){
            int start = startIndex(nums2,nums1[i]);
            System.out.println(start);
            for(int j=start; j<nums2.length; j++){
                if (nums1[i] < nums2[j]){
                    isTrue = true;
                    arr[index++] = nums2[j];
                    break;
                }else {
                    isTrue = false;
                }
            }
            if (!isTrue){
                arr[index++] = -1;
            }
        }
        return arr;
    }

    static int startIndex(int [] arr,int element){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
