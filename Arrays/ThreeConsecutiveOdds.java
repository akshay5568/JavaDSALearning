package Arrays;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int [] arr  = {1,2,5,6,8,9,5,7,11};
        boolean ans = threeConsecutiveOdds(arr);
        System.out.println(ans);
    }

    static boolean threeConsecutiveOdds(int[] arr) {
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 !=0){
                counter++;
                if(counter == 3){
                    return true;
                }
            }
            else counter = 0;
        }

        return false;
    }
}
