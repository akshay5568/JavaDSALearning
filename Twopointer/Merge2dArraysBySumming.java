package Twopointer;

import java.util.*;

public class Merge2dArraysBySumming {
    public static void main(String[] args) {
        int [][] nums1 = {{1,2},{2,3},{4,5}};
        int [][] nums2 = {{1,4},{3,2},{4,1}};
        int [] [] ans = mergeArrays(nums1,nums2);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> st = new TreeMap<>();
        Set <Integer> list = new HashSet<>();

        for (int i=0; i<nums1.length; i++) {
            st.put(nums1[i][0],nums1[i][1]);
            list.add(nums1[i][0]);
        }
        for (int i=0; i<nums2.length; i++) {
            list.add(nums2[i][0]);
            boolean isAdded = st.containsKey(nums2[i][0]);
            if (isAdded){
                int temp = st.get(nums2[i][0]);
                int sum = temp + nums2[i][1];
                st.replace(nums2[i][0],sum);
            }else {
                st.put(nums2[i][0],nums2[i][1]);
            }
        }
        System.out.println(list.size());
        System.out.println(st);


        int answer [] [] = new int [list.size()][2];
        int indexI = 0;
        int indexJ = 0;
        for(Map.Entry<Integer,Integer> i : st.entrySet()){
            answer[indexI][indexJ] = i.getKey();
            indexJ++;
            answer[indexI][indexJ] = i.getValue();
            indexI++;
            indexJ = 0;
        }
        return answer;
    }
}
