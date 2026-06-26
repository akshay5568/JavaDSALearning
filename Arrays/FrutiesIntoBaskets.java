package Arrays;

public class FrutiesIntoBaskets {
    public static void main(String[] args) {

    }

    static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;

        for(int i=0; i<fruits.length; i++){
            boolean isValid = false;
            for(int j=0; j<baskets.length; j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = Integer.MIN_VALUE;
                    isValid = true;
                    break;
                }
            }
            if(!(isValid)){
                count++;
            }
        }
        return count;
    }
}
