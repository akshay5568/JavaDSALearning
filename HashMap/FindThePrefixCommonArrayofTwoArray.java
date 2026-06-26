package HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindThePrefixCommonArrayofTwoArray {
    public static void main(String[] args) {
        int A[] = {1,3,2,4};
        int B[] = {3,1,2,4};
        int [] arr = findThePrefixCommonArray(A,B);
        System.out.println(Arrays.toString(arr));
    }

    static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] arr = new int[A.length];
        Set<Integer> list = new HashSet<>();
        Set <Integer> list1 = new HashSet<>();

        for(int i=0; i<A.length; ++i){
            list.add(A[i]);
            list1.add(B[i]);

            int count = 0;

            for(int element : list){
                if(list1.contains(element)){
                    ++count;
                }
            }

            arr[i] = count;
        }
        return arr;
    }
}
