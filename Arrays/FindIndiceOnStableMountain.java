package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindIndiceOnStableMountain {
    public static void main(String[] args) {

    }


    static List find(int [] height, int threshold){
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                result.add(i);
            }
        }

        return result;
    }
}
