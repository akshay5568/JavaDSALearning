package Recuersion;

public class BasicRec {
    public static void main(String[] args) {
        int [] arr = {1,23,5,8,45,5};
        int target = 5;
        System.out.println(LastOccer(arr,target,0));
    }

    static int Rec(int[]arr, int target, int i){
         if (arr[i] == target){
             return i;
         }
         if(i == arr.length-1){
             return -1;
         }
        return Rec(arr,target,i+1);
    }

    static int LastOccer(int [] arr, int target, int i){
        if(i == arr.length) return -1;
        int isFound = LastOccer(arr,target,i+1);
        if(arr[i] == target && isFound == -1) return i;
        return isFound;
    }
}
