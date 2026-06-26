package Arrays;

import java.util.Arrays;

public class FindNUniqueInteger {
    public static void main(String[] args) {
        int [] ans = sumZero(5);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sumZero(int n) {
        if(n == 1) return new int[]{0};
        int ans [] = new int [n];
        int half = n / 2;
        int index = 0;
        for(int i=1; i<=half; i++){
            ans[index++] = i;
        }
        if (n % 2 == 0){
            int tempIndex = 0;
            for(int j=index; j<ans.length; j++){
                ans[index++] = -(ans[tempIndex]);
                tempIndex++;
            }
        }else {
            int tempIndex = 0;
            for(int j=index; j<ans.length; j++){
                ans[index++] = -(ans[tempIndex]);
                tempIndex++;
            }
        }

        return ans;
    }
}
