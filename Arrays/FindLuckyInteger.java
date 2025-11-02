package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindLuckyInteger {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,3};
        int ans = findLucky(arr);
        System.out.println(ans);
    }

    static int findLucky(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == arr[i]) {
                    count++;
                }
            }
            if(arr[i] == count){
                list.add(arr[i]);
            }
        }

        if(list.size() == 0){
            return -1;
        }

        int ans = list.get(0);
        for(int k=0; k<list.size(); k++){
            if(ans < list.get(k)){
                ans = list.get(k);
            }
        }

        return ans;

    }
}
