package Arrays;

public class EarliestTimeToFinishWork {
    public static void main(String[] args) {
        int [][] arr = {{1,6},{2,3}};
        int ans = earliestTime(arr);
        System.out.println(ans);
    }

    static int earliestTime(int[][] tasks) {
        int ans = tasks[0][0] + tasks[0][1];
        for(int i=0; i<tasks.length; i++){
            int sumOf = sum(tasks[i]);
            System.out.println(sumOf);
            if(ans > sumOf){
                ans = sumOf;
            }
        }
        return ans;
    }

    static int sum(int [] nums){
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans += nums[i];
        }
        return ans;
    }
}
