package Arrays;


import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int []arr = {1,2,3,5};
        int ans = MissingElement(arr);
        System.out.println(ans);
    }
//
//    static String LongestCommonPrefix(String[] strs){
//        StringBuilder str = new StringBuilder();
//        for (int i =0; i < strs.length-1; i++){
//            for (int j=0; j < strs.length; j++){
//                if (strs[i].charAt(j) == strs[i+1].charAt(j)) {
//                    if (strs[2].charAt(j)== strs[i].charAt(j)) {
//                        str.append(strs[i].charAt(j));
//                    }
//
//                }
//
//            }
//        }
//
//        int strLength = str.length();
//        String Exact = String.valueOf(str.delete(0,strLength/2));
//        return Exact;
//    }

    static void sum(int [] arr){
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum = arr[i] + sum;
        }
        System.out.println(sum);
    }

    static void BubbleSort(int [] arr){
        for (int i=0; i< arr.length; i++){
            for (int j=1; j<arr.length; j++){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static int MissingElement(int [] arr){
        for (int i=0; i< arr.length; i++){
            for (int j=1; j<arr.length; j++){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr.length; j++){
                int index = 0;
                if (arr[j] != arr[index+1]){
                     return arr[index+1];
                }
                else {
                    index++;
                }
            }
        }
        return -1;
    }
}
