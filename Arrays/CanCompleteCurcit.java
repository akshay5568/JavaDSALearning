package Arrays;

public class CanCompleteCurcit {
    public static void main(String[] args) {
        int [] arr = {5,1,2,3,4};
        int ans = canCompleteCircuit(arr,new int [] {4,4,1,5,1});
//        int [] arr = {1,2,3,4,5};
//        int ans = canCompleteCircuit(arr,new int [] {3,4,5,1,2});
        System.out.println(ans);
    }


    //Today I tried this LeetCode problem and I have been trying to solve it since 2 hours but still I could not able
    // to solve it. Maybe i have to use another method to solve this problem completely;

    static int canCompleteCircuit(int[] gas, int[] cost) {
        int temp = 0;
        int startingPoint = -1;
        boolean isGet = true;
        boolean isGetTemp = true;


        for(int i = 0; i<gas.length; i++){
        if (isGetTemp){
             temp = gas[i];
             isGetTemp = false;
        }
            if(temp >= cost[i]){

                if(startingPoint == i) return i;
                if(isGet){
                    startingPoint = i;
                    isGet = false;
                }


                if((i + 1) > gas.length-1){
                    int temp2 = i;
                    i = 0;
                    temp = (temp - cost[temp2] + gas[i]);
                    continue;
                }


                temp = (temp - cost[i]) + gas[i+1];
            }

        }



        return -1;
    }
}
