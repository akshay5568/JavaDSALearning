package StackAndQueues;

import java.util.Arrays;

public class DailyTemprachure {
    public static void main(String[] args) {
        int [] arr = {55,38,53,81,61,93,97,32,43,78};
        int [] ans =dailyTemperatures(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] dailyTemperatures(int[] temperatures) {
        int index=0;
        boolean isValid = false;
        int [] ans = new int [temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            for(int j=i; j<temperatures.length; j++){
                if(temperatures[i] < temperatures[j]){
                    ans[index++] = (j - i);
                    isValid = true;
                    break;
                }else{
                    isValid = false;
                }
            }
            if (!(isValid)){
                index++;
            }
        }
        return ans;
    }
}
