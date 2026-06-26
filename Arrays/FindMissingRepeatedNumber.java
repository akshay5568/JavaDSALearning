package Arrays;

import java.util.Arrays;

public class FindMissingRepeatedNumber {
    public static void main(String[] args) {
       int [] [] grid = {
//               {9,1,7},
//               {8,9,2},
//               {3,4,6}
               {1,3},
               {2,2}
       };
       int [] ans = findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findMissingAndRepeatedValues(int[][] grid) {
            int [] temp = converTo1(grid);
            Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
            int rep = repeat(temp);
            int mis = missingNum(temp);
            return new int[]{rep,mis};
    }

    static int [] converTo1(int [] [] arr){
         int ans [] = new int[arr.length * arr[0].length];
         int count = 0;
         for (int i=0; i<arr.length; i++){
             for (int j=0; j<arr[i].length; j++){
                  ans[count] = arr[i][j];
                  count++;
             }
         }
         return ans;
    }

    static int repeat(int [] temp){
        int ans = 0;
         for(int i=0; i<temp.length; i++){
             for (int j=i+1; j<temp.length; j++){
                 if (temp[i] == temp[j]){
                     ans = temp[j];
                 }
             }
         }
         return ans;
    }

    static int missingNum(int[] temp) {
        int n = temp.length;

        for (int i = 1; i <= n; i++) {
            if (Arrays.binarySearch(temp, i) < 0) {
                return i;
            }
        }
        return -1;
    }


}
