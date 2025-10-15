package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
       int [] arr = {3,2,2,3};
       int target = 3;
       int ans = RemoveElement(arr,target);
        System.out.println(ans);
    }

    static String evenOrOdd (int num) {
        if (num % 2 == 0) return "even";
        else return "odd";
    }

    static void Boxstartpattern (int num) {
        int count = 0;
        int min = num;
         for (int i =0; i < num; i++){
             for (int j=0; j<=num; j++){
                if (i==0 || j==0 || j==num || i==num-1 || j==count || j==min) System.out.print("*");
                else System.out.print(" ");
             }
             System.out.println(" ");
             count++;
             min--;
         }
    }

    static void AstarPattern (int num) {
        int count = (num/2);
        int count2 = (num/2);

        for (int i=0; i < num; i++){
            for (int j=0; j <= num; j++){
                if (j==count || j==count2) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
            count++;
            count2--;
        }
    }

    static boolean ArraySearch (int[] arr , int number){
        int count = 0;
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] == number){
                return true;
            }
            count = arr[i];
        }
        return false;
    }


    static int SearchIndexWise(int[] arr, int start, int end , int number) {
        for (int i = start; i <= end; i++){
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    static int MinNumber(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
             if (arr[i] < min){
                 min = arr[i];
             }
        }
        return min;
    }

    static boolean Search2dArr(int[][] arr, int number){
        for (int i=0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    static int findNumbers (int [] nums ){
        int count = 0;
        for (int i =0; i < nums.length; i++){
            if (even(nums[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums){
        int numberDigit = digit(nums);
        return numberDigit % 2 ==0;
    }

    static int digit(int nums){
        int count = 0;
        while (nums > 0){
            count++;
            nums = nums / 10;
        }
        return count;
    }

    static int [] RunningSum(int [] nums){
            for (int i = 0; i < nums.length; i++){
                if (i > 0) {
                        nums[i] = nums[i] + nums[i-1];
                }
            }
        return nums;
    }


    static int RichestCust(int [] [] accounts){
        int ans = 0;

        for (int i =0; i < accounts.length; i++){
            int count = 0;
            for (int j =0; j < accounts[i].length; j++){
                if (j > 0){
                    accounts[i][0] = accounts[i][j] + accounts[i][count];
                    count++;
                    if (accounts[i][0] > ans){
                        ans = accounts[i][0];
                    }
                }
                else {
                    if (accounts[i][j] > ans){
                        ans = accounts[i][j];
                    }
                }
            }
        }
        return ans;
    }

   static int[] RemoveDuplicate(int [] nums){
        int counter = 0;
        int arr[] = new int[nums.length];

        for (int i =0; i < nums.length; i++){
            boolean isDuplicate = false;

            for (int j =0; j < counter; j++){
                if (nums[i] == arr[j]){
                   isDuplicate = true;
                   break;
                }
            }

            if (!isDuplicate){
                arr[counter] = nums[i];
                counter++;
            }


        }
       int [] result = new int[counter];
       for (int k =0; k < counter; k++){
           result[k] = arr[k];
       }
        return result;
    }


    static int RemoveElement(int [] nums, int val){
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                list.add(nums[i]);
            }
        }
        return list.size();
    }
}
