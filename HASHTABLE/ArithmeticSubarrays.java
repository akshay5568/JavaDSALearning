package HASHTABLE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    public static void main(String[] args){
        List<Boolean> ans = checkArithmeticSubarrays(new int[]{4,6,5,9,3,7},new int[]{0,0,2},new int[] {2,3,5});
        System.out.println(ans);
    }


        static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r){
            List<Boolean> answer = new ArrayList<>();
            for (int i=0; i<l.length; i++){
                int temp[] = Arrays.copyOfRange(nums,l[i],r[i]+1);
                Arrays.sort(temp);
                answer.add(check(temp));
            }
            return answer;
        }


        static boolean check(int []temp){
        if (temp.length < 2) return true;
            int diff = temp[1] - temp[0];
            for(int i=1; i<temp.length-1; i++){
                if(diff != temp[i+1] - temp[i]) return false;
            }
            return true;
        }

}
