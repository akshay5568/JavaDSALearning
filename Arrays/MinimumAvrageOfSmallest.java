package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MinimumAvrageOfSmallest {
    public static void main(String[] args) {
        int [] arr = {7,8,3,4,15,13,4,1};
        double ans = minimumAverage(arr);
        System.out.println(ans);
    }


    static double minimumAverage(int[] nums) {
        List<Double> averages = new ArrayList<Double>();
        List<Double> list = new ArrayList<>();
        for(int c : nums){
            list.add(Double.valueOf(c));
        }


        while(list.size() > 0){
            double max = maxElement(list);
            double min = minElement(list);
            double avrage = (max + min) / 2;

            averages.add(avrage);

            list.remove(max);
            list.remove(min);

        }

        double ans = (double)(averages.get(0));
        for(int i=0; i<(double)(averages.size()); i++){
            if(ans > (double)(averages.get(i))){
                ans = (double)(averages.get(i));
            }
        }
        System.out.println(ans);
        return ans;
    }

    static double maxElement(List list){
        double ans = (double)(list.get(0));
        for(int i=0; i<list.size(); i++){
            if((double)(list.get(i)) > ans){
                ans = (double)(list.get(i));
            }
        }
        return ans;
    }

    static double minElement(List list){
        double ans = (double)(list.get(0));
        for(int i=0; i<list.size(); i++){
            if((double)(list.get(i)) < ans){
                ans = (double)(list.get(i));
            }
        }
        return ans;
    }

}
