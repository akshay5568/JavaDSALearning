package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumberGame {
    public static void main(String[] args) {
        int [] arr = {5,4,2,3};
        int [] ans = numberGame(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] numberGame(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        int count = 0;
        while(list.size() > 0){
            int Alice = minElement(list);
            list.remove(Integer.valueOf(Alice));
            int Bob = minElement(list);
            list.remove(Integer.valueOf(Bob));
            nums[count] = Bob;
            count++;
            nums[count] = Alice;
            count++;
        }

        return nums;
    }


    static int minElement(ArrayList list){
        System.out.println(list);
        int minElement = (int)(list.get(0));
        for(int i=0; i<list.size(); i++){
            if((int)(list.get(i)) < minElement){
                minElement = (int)(list.get(i));
            }
        }
        return minElement;
    }
}

