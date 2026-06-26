package Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class FindTheWinnerOFTheCurcullerGame {


    public static void main(String[] args) {
        int ans = findTheWinner(5,2);
        System.out.println(ans);
    }

    public static int findTheWinner(int n, int k) {
         List<Integer> list = new ArrayList<>();
         for (int i=1; i<=n; i++){
             list.add(i);
         }
         int count = 0;
         helperRec(list,k,0);

         //This was an Itrative approach to sovle this problem but I had to solve it
        // Using Recursion, therefore I used recursion.
//        while (list.size() != 1) {
//
//        }
         return list.getFirst();
    }

    //This is the helper Recursive function to solve this problem.
    public static void helperRec(List<Integer> list, int k, int count){
        if (list.size() == 1) return;
        for (int i = 0; i < k; i++) {
            if (count > list.size()-1) count = 0;
            if (i == k-1) {
                list.remove(count);
                break;
            };
            System.out.println(list);
            count++;
        }
        helperRec(list,k,count);
    }

}
