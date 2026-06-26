package Twopointer;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int [] arr = {3,8,7,1,4};
        int ans = numRescueBoats(arr,9);
        System.out.println(ans);
    }

//    static int numRescueBoats(int[] people, int limit) {
//        if(people.length == 1) return people.length;
//        int r = 1;
//        int l = 0;
//        int count = 0;
//        while(l < people.length){
//            if((people[r] + people[l]) <= limit){
//                count++;
//                r = r + 2;
//                l = r - 1;
//            }
//            else {
//                count++;
//                r++;
//                l++;
//            }
//
//            if(l == people.length-1){
//                count++;
//                l++;
//            }
//        }
//        return count;
//    }

    static int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int row = 0;
        Arrays.sort(people);
        int l = 0;
        int r = people.length-1;
        while(l <= r){
            if ((people[l] + people[r]) <= limit){
                count++;
                r--;
                l++;
            }
            else if ((people[l] + people[r]) > limit){
                r--;
                row++;
            }
        }
        return count + row;
    }
}
