package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Finding3DigitEvenNumbers {
    public static void main(String[] args) {
          int [] arr = {1,2,3,4};
          int [] ans = findEvenNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findEvenNumbers(int[] digits) {
        // ArrayList <Integer> list = new ArrayList<Integer>();
        //   String[] arr = new String[digits.length];
        //   for(int l=0; l<digits.length; l++){
        //       arr[l] = String.valueOf(digits[l]);
        //   }
        //   for(int i=0; i<arr.length; i++){
        //       for(int j=0; j<arr.length; j++){
        //            for(int p=0; p<arr.length; p++){
        //                String digit = arr[i] + arr[j] + arr[p];
        //                boolean sameDigit = true;
        //                for(int m=0; m<digit.length(); m++){
        //                    for(int k=m+1; k<digit.length(); k++){
        //                        if(digit.charAt(m) == digit.charAt(k)){
        //                             sameDigit = false;
        //                         }
        //                    }
        //                }
        //                int intDigit = Integer.parseInt(digit);
        //                if(intDigit % 2 == 0 && !digit.startsWith("0") && sameDigit == true){
        //                   list.add(intDigit);
        //                }
        //            }
        //       }
        //   }
        //     int ans [] = new int [list.size()];
        //   for(int k=0; k<list.size(); k++){
        //       ans[k] = list.get(k);
        //   }
        //  Arrays.sort(ans);
        //   return ans;


        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) {
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                        if (num >= 100 && num % 2 == 0) {
                            set.add(num);
                        }
                    }
                }
            }
        }

        int [] ans = new int [set.size()];
        int index = 0;
        for (int num : set) {
            ans[index++] = num;
        }
        Arrays.sort(ans);
        return ans;
    }
}
