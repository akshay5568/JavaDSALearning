package Arrays;

import java.util.Arrays;

public class CanMakeArithmaticProgression {
    public static void main(String[] args) {

    }

        public boolean canMakeArithmeticProgression(int[] arr) {
            Arrays.sort(arr);
            boolean isTrue = check(arr);
            return isTrue;
        }

        public boolean check(int [] arr){
            if(arr.length < 2) return true;
            int diff = arr[1] - arr[0];
            for(int i=1; i<arr.length-1; i++){
                if(diff != arr[i+1] - arr[i]) return false;
            }
            return true;
        }

}
