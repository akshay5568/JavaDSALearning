package Recuersion;

public class BinarySearchViaRecursion {
    public static void main(String[] args) {
              int [] arr = {1,3,4,5,87};
              int target = 87;
              int ans = Rec(arr,target,0,arr.length-1);
              System.out.print(ans);
    }

    static int Rec(int [] arr, int target, int start, int end){
          if (end<start){
              return -1;
          }
          int m = (start + end) / 2;
          if(arr[m] == target){
              return m;
          }
          if(arr[m] > target){
              return Rec(arr,target,start,m-1);
          }
          return Rec(arr,target,m+1,end);
    }
}
