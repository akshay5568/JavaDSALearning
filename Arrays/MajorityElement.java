package Arrays;

import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {
    public static void main(String[] args) {

    }

    static int majorityElement(int[] arr) {
        TreeMap<Integer,Integer> tt = new TreeMap<>();

        for(int i=0; i<arr.length; i++){
            if(!tt.containsKey(arr[i])){
                tt.put(arr[i],1);
            }else{
                int temp = tt.get(arr[i]);
                tt.put(arr[i],++temp);
            }
        }

        int result = 0;
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry : tt.entrySet()){
            if(entry.getValue() > result){
                result = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
