package SlidingWindow;

import java.util.Arrays;

public class DefuseBomb {
    public static void main(String[] args) {
        int [] arr = {2,4,9,3};
        int [] ans = decrypt(arr,-2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] decrypt(int[] code, int k) {
        int [] ans = new int [code.length];
        for(int l =0; l<code.length; l++){
            int count = 0;
            int r = 0;
            int sum = 0;
            if(k < 0){
                if (l == 0) r = code.length-1;
                else r = l - 1;

                while(count != k){
                        if(r == -1) r = code.length-1;
                        sum += code[r--];
                        count--;
                }
                ans[l] = sum;
            }else{
                r = l+1;
                while(count != k){
                    if(r == code.length){
                        r = 0;
                    }
                    sum += code[r++];
                    count++;
                }
                ans[l] = sum;
            }
        }
        return ans;
    }
}
