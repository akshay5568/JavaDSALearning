import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//             int [][] arr = {
//                     {1,2,3},
//                     {4,5,6},
//                     {7,8,9}
//             };
//             boolean ans = Search2dArr(arr, 87);
//        System.out.println(ans);

        int arr [] = {12,345,2,6,7896};
        int ans = findNumbers(arr);
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

    
}
