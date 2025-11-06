package Arrays;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayOfInteger {
    public static void main(String[] args) {
        int [] arr = {9,9,9,9,9,9,9,9,9,9};
        List ans = addToArrayForm(arr,1);
        System.out.println(ans);
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        String str = String.valueOf(k);
        String sum = "";
        for(int l : num){
            sum += String.valueOf(l);
        }
        System.out.println(sum);
        System.out.println(str);
        int ans = Integer.parseInt(sum) + Integer.parseInt(str);
        System.out.println(ans);
        String finalAns = String.valueOf(ans);

        List list = new ArrayList();
        for(int i=0; i<finalAns.length(); i++){
            list.add(Integer.parseInt(String.valueOf(finalAns.charAt(i))));
        }
        return list;
    }
}
