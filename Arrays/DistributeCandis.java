package Arrays;

import java.util.HashSet;

public class DistributeCandis {
    public static void main(String[] args) {
        int [] ans = {1,1,2,2,3,3};
        int ansss = distributeCandies(ans);
        System.out.println(ansss);
    }

    static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int typ : candyType){
            set.add(typ);
        }

        int canDylenth = candyType.length / 2;
        int sizd = set.size();
        return Math.min(canDylenth,sizd);
    }
}
