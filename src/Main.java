import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int arrTotal = arr.length-1;
        int[] doubleArr = new int[arrTotal+1];
        int count = 0;

        for (int i=arrTotal; i >= 0  ; i--){
            doubleArr[count] = arr[i];
            System.out.println(doubleArr[count]);
            count++;
        }   
    }
}