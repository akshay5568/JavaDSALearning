package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGretesrtCandeis{
    public static void main(String[] args) {
        int [] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List <Boolean> ans = kidsWithCandies(candies,extraCandies);
        System.out.println(ans);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> ans = new ArrayList<>();
        int maxCand = 0;
        for(int i=0; i<candies.length; i++){
            if (maxCand < candies[i]){
                maxCand = candies[i];
            }
        }
        for (int j=0; j<candies.length; j++){
            if (maxCand <= candies[j] + extraCandies){
                ans.add(true);
            }
            else {
                ans.add(false);
            }
        }
        return ans;
    }
}
