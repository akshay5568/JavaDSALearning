package Recursion.Patterns;

import HASHTABLE.WordPattern;
import HashMap.WordSearch;

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

//    public static void main(String[] args) {
//            int []arr= {3,2,1};
//            int [] ans = Rec(arr);
//            System.out.println(Arrays.toString(ans));
//    }


//    public static void main(String[] args) {
//        ArrayList<Integer> ans = firstDoubleIntegerDigit(1);
//        System.out.println(ans);
//    }

//    public static void main(String[] args){
//        char [][] arr = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        System.out.println(exist(arr,"ABCB"));
//    }


    public static void main(String[] args) {
        int [] arr= {1,2,2,3,3};
        boolean[] used = new boolean[arr.length];
        permutation(arr,new ArrayList<>(),used);
    }

    public static void permutation(int [] arr, List<Integer>temp,boolean[] used){
        if (temp.size() == arr.length) {
            System.out.println(temp);
            return;
        }
        for (int i=0; i<arr.length; i++){
            if (used[i]) continue;
            used[i] = true;
            temp.add(arr[i]);
            permutation(arr,temp,used);
            used[i] = false;
            temp.removeLast();
        }
    }



//    public static boolean exist(char [][] arr, String word){
//        boolean [][] used = new boolean[arr.length][arr[0].length];
//        boolean result = false;
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                if (word.charAt(0) == arr[i][j]){
//                    result = WordSearch(arr,word,i,j,0,used);
//                    if (result) return true;
//                }
//            }
//        }
//        return false;
//    }


//    public static boolean WordSearch(char [][] arr, String word,int row,int col,int start,boolean [][] used){
//        if (start == word.length()) return true;
//        if (0 > row || 0 > col || arr.length <= row || arr[row].length <= col || used[row][col] || word.charAt(start) != arr[row][col]) return false;
//
//        used[row][col] = true;
//        boolean res = WordSearch(arr,word,row,col+1,start+1,used)
//                || WordSearch(arr,word,row,col-1,start+1,used)
//                || WordSearch(arr,word,row+1,col,start+1,used)
//                || WordSearch(arr,word,row-1,col,start+1,used);
//        used[row][col] = false;
//
//        return res;
//    }


















    public static ArrayList<Integer> firstDoubleIntegerDigit(int n){
        ArrayList<Integer> temp = new ArrayList<>();
        if (n > 9) return temp;
        temp.add(n);
        temp.addAll(firstDoubleIntegerDigit(n+1));
        return temp;
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
