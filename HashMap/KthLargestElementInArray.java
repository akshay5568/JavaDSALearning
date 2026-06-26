package HashMap;

import java.util.*;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        int [] arr = {3,2,3,1,2,4,5,5,6};
        int ans = findKthLargest(arr,4);
        System.out.println(ans);
    }

    static int findKthLargest(int[] nums, int k) {
        List <Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        int maxElement = Integer.MIN_VALUE;
        int temp = 0;
        for (int i=0; i<k; i++){
            for (int j=0; j<list.size(); j++){
                maxElement = Math.max(maxElement,list.get(j));
            }
            int index = list.indexOf(maxElement);
            list.remove(index);
            if (i == k-1){
                temp = maxElement;
            }
            maxElement = Integer.MIN_VALUE;
        }
        System.out.println(list);
        return temp;
    }
}
