import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1,2,3,4,5};
        int []ans = ReversArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    static void ReverArray(int [] arr){
        int arrTotal = arr.length-1;
        int[] doubleArr = new int[arrTotal+1];
        int count = 0;

        for (int i=arrTotal; i >= 0  ; i--){
            doubleArr[count] = arr[i];
            System.out.println(doubleArr[count]);
            count++;
        }
    }

    static int [] ReversArray(int [] arr){
        int [] arr2 = new int [arr.length];
        int count = 0;
        for (int i = arr.length-1; i >= 0; i--){
             arr2[count]= arr[i];
             count++;
        }
        return arr2;
    }


    static int [] ReverArray2(int [] arr, int target){
        int [] anss = {0,0};
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                int ans = arr[i] + arr[j];
                if (target == ans){
                    anss[0] = i;
                    anss[1] = j;
                    return anss;
                }
            }
        }
       return anss;
    }
}