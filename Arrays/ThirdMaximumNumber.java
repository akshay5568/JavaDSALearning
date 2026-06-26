package Arrays;

import java.util.TreeSet;

public class ThirdMaximumNumber {
    public static void main(String[] args) {

    }

    static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
        }
        if (set.size() < 3) {
            return set.last();
        }
        set.remove(set.last());
        set.remove(set.last());
        return set.last();

    }
}
