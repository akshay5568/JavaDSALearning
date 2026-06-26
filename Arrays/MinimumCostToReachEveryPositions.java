package Arrays;

public class MinimumCostToReachEveryPositions {
    public static void main(String[] args) {
    }
    static int[] minCosts(int[] cost) {
        int [] ans = new int [cost.length];
        for(int i=0; i<ans.length; i++){
            ans[i] = Math.min(i > 0 ? ans[i-1] : Integer.MAX_VALUE, cost[i]);
        }
        return ans;
    }
}
