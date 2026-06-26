package Recursion;

import java.util.Arrays;

public class ConstructLexographicallyLargestValidSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructDistancedSequence(3)));
    }

    public static int[] constructDistancedSequence(int n) {
        int [] ans = new int[2 * n - 1];
        boolean[] used = new boolean[ans.length+1];
        backTrack(0,used,ans,n);
        return ans;
    }

    public static boolean backTrack(int index,boolean[] used,int [] ans,int n){
        if (index == ans.length) return true;
        if (ans[index] != 0) return backTrack(index+1,used,ans,n);
        else {
            for (int i=n; i>=1; i--){
                if (used[i]) continue;
                used[i] = true;
                ans[index] = i;
                if (i == 1){
                    if (backTrack(index + 1,used,ans,n)) return true;
                } else if (index + i < ans.length && ans [index + i] == 0){
                    ans[index + i] = i;
                    if (backTrack(index+1, used,ans,n)) return true;
                    ans[index + i] = 0;
                }
                ans[index] = 0;
                used[i] = false;
            }
        }
        return false;
    }





    /*
Given an integer n, find a sequence with elements in the range [1, n] that satisfies all of the following:

The integer 1 occurs once in the sequence.
Each integer between 2 and n occurs twice in the sequence.
For every integer i between 2 and n, the distance between the two occurrences of i is exactly i.
The distance between two numbers on the sequence, a[i] and a[j], is the absolute difference of their indices, |j - i|.

Return the lexicographically largest sequence. It is guaranteed that under the given constraints, there is always a solution.

A sequence an is lexicographically larger than a sequence b (of the same length) if in the first position where a and b differ,
sequence a has a number greater than the corresponding number in b.
For example, [0,1,9,0] is lexicographically larger than [0,1,5,6] because the first position they differ is at the third number,
 and 9 is greater than 5.

Example 1:

Input: n = 3
Output: [3,1,2,3,2]
Explanation: [2,3,2,1,3] is also a valid sequence, but [3,1,2,3,2] is the lexicographically largest valid sequence.
Example 2:

Input: n = 5
Output: [5,3,1,4,3,5,2,4,2]
    */

}
