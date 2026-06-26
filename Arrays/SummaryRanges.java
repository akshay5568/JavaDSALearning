package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int [] arr = {0,1,2,4,5,7};
        List<String> ans = summaryRanges(arr);
        System.out.println(ans);
    }

//    static List<String> summaryRanges(int[] nums) {
//        List<String> list = new ArrayList<>();
//        int temp = 1;
//        boolean isValid = true;
//
//        for(int i=0; i<nums.length; i++){
//            for (int j=i+1; j<nums.length; j++){
//                if(nums[i]+temp == nums[j]) {
//                    temp++;
//                    isValid = false;
//                    if (j < nums.length-1 && nums[i]+temp == nums[j+1]){
//                        continue;
//                    }else{
//                        String a = String.valueOf(nums[i]);
//                        String b = String.valueOf(nums[j]);
//                        String sum = a+"->"+b;
//                        list.add(sum);
//                        temp = 1;
//                        i = j;
//                        isValid = true;
//                        break;
//                    }
//                }
//                if (isValid){
//                    list.add(String.valueOf(nums[i]));
//                    break;
//                }
//            }
//        }
//        return list;
//    }

    static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int i =0;
        while(i < nums.length){
            int start = nums[i];

            while(i + 1 < nums.length && nums[i+1] == nums[i] + 1){
                i++;
            }

            int end = nums[i];
            if(end == start){
                list.add(String.valueOf(start));
            }else{
                list.add(start +"->"+ end);
            }
            i++;
        }
        return list;
    }
}

