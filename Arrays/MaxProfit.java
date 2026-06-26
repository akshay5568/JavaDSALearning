package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MaxProfit {
    public static void main(String[] args) {
        int [] arr = {3,3,5,0,0,3,1,4};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }

    static int maxProfit(int[] prices) {
        int buy1 = Integer.MAX_VALUE;
        int profit1 = 0;

        int buy2 = Integer.MAX_VALUE;
        int profit2 = 0;

        for (int price : prices) {
            buy1 = Math.min(buy1, price);
            profit1 = Math.max(profit1, price - buy1);

            buy2 = Math.min(buy2, price - profit1);
            profit2 = Math.max(profit2, price - buy2);
        }

        return profit2;
    }


//    static int maxProfit(int[] prices) {
//        int sum = 0;
//
//        List<Integer> list = new ArrayList<>();
//
//        for(int i=0; i<prices.length; i++){
//            int temp = 0;
//            for(int j=i+1; j<prices.length; j++){
//                if(prices[i] < prices[j]){
//                    temp = prices[j] - prices[i];
//                    list.add(temp);
//                }
//                break;
//            }
//        }
//        if(list.isEmpty()){
//            return 0;
//        }
//        boolean isAll = false;
//        for(int k=0; k<list.size()-1; k++){
//            if(!Objects.equals(list.get(k + 1), list.get(k))){
//                isAll = true;
//            }
//        }
//        Collections.sort(list);
//        if(isAll){
//            sum += list.getLast();
//            sum += list.get(list.size() - 2);
//            return sum;
//        }else{
//            return list.size() * list.getFirst();
//        }
//    }
}
