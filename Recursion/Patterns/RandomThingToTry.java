package Recursion.Patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomThingToTry {
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,5};
//        List<List<Integer>> ans = new ArrayList<>();
//        Rec(arr,0,8,0,ans,new ArrayList<>());
//        System.out.println(ans);
//    }

    public static void main(String[] args) {
            int []arr= {87,54,34,4,6436,423434,4234,43434};
            int [] ans = Rec(arr);
            System.out.println(Arrays.toString(ans));
    }


    public static int [] Rec(int [] arr){
        if (arr.length == 1) return arr;
        int mid = arr.length/2;
        int [] first = Rec(Arrays.copyOfRange(arr,0,mid));
        int [] second = Rec(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }

    public static int [] merge(int [] first, int [] second){
        int [] temp = new int[first.length+second.length];
        int f = 0;
        int s = 0;
        int index = 0;
        while (f < first.length && s < second.length){
            if (first[f] < second[s]){
                temp[index++] = first[f];
                f++;
            }else{
                temp[index++] = second[s];
                s++;
            }
        }

        while (s < second.length){
            temp[index++] = second[s];
            s++;
        }

        while (f < first.length){
            temp[index++] = first[f];
            f++;
        }

        return temp;
    }


    public static boolean removeOdds(int [] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0){
                arr[i] = 0;
            }
        }
        return true;
    }






//    public static void Rec(int [] arr, int start, int target, int temp,List<List<Integer>> ans,List<Integer> l1){
//        if (temp >= target){
//            if (temp == target) ans.add(new ArrayList<>(l1));
//            return;
//        }
//        for (int i=start; i<arr.length; i++){
//            l1.add(arr[i]);
//            temp += arr[i];
//            Rec(arr,i+1,target,temp,ans,l1);
//            l1.removeLast();
//            temp -= arr[i];
//        }
//    }
}
