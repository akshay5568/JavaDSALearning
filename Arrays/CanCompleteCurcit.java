package Arrays;

public class CanCompleteCurcit {
    public static void main(String[] args) {
        int [] arr = {5,1,2,3,4};
        int ans = canCompleteCurcit(arr,new int [] {4,4,1,5,1});
//        int [] arr = {1,2,3,4,5};
//        int ans = camCompleteCircuit(arr,new int [] {3,4,5,1,2});
        System.out.println(ans);
    }

    //I have to solve this problem still because it did not pass all the test cases.

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

    static int camCompleteCircuit(int [] gas, int [] cost){
        int ans = -1;
        int sum = 0;
        int index = 0;
        boolean isTrueOneTime = true;

        for (int i=0; i<gas.length; i++){
            if (gas[i] >= cost[i]){
                index = i;
                sum = gas[i];
            }
        }

        for(int i=index; i<gas.length; i++){
                if (cost[i] > sum) return -1;
                if (ans == i) return ans;
                if (isTrueOneTime){
                    ans = i;
                    isTrueOneTime = false;
                }
                if (i == gas.length-1){
                    sum = sum - cost[i] + gas[0];
                    i = 0;
                }else{
                    sum = sum - cost[i] + gas[i+1];
                }
        }
      return ans;
    }


    static int canCompleteCurcit(int [] gas, int [] cost){
        int start =0;
        int tank = 0;
        int total = 0;

        for (int i=0; i<gas.length; i++){
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;

            if (tank < 0){
                start = i + 1;
                tank = 0;
            }
        }
      return total >= 0 ? start : -1;
    }
}
