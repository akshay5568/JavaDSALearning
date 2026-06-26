package Arrays;

import java.util.Arrays;

public class FinalPriceWithSpecialDis {
    public static void main(String[] args) {
        int [] nums = {8,4,6,2,3};
        int [] ans = finalPrices(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] finalPrices(int[] prices) {
        int [] answer = prices.clone();

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i] >= prices[j]){
                    answer[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return answer;
    }
}
