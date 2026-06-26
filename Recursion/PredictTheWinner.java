package Recursion;

import java.util.Arrays;
import java.util.Random;

public class PredictTheWinner {
    public static void main(String[] args) {
        System.out.println(predictTheWinner(new int[]{1,5,233,7}));
    }

    public static boolean predictTheWinner(int[] nums) {
        int r=nums.length-1; int l=0; int p1 =0; int p2=0; boolean timeToAdd = true;
        return rec(r,l,p1,p2,nums,timeToAdd);
    }

    public static boolean rec(int r,int l,int p1, int p2,int [] nums, boolean timeToAdd){
        if (r == l) return p1 >= p2;
        Random rnd = new Random();
        int random = rnd.nextInt(2);
        if (random == 0) {
            if (timeToAdd) p1 += nums[l];
            else p2 += nums[l];
            l++;
        }else {
            if (timeToAdd) p1 += nums[r];
            else p2 += nums[r];
            r--;
        }
        rec(r,l,p1,p2,nums,!timeToAdd);
        return p1 >= p2;
    }
}
