package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ConvertAnArrayInto2d {
    public static void main(String[] args) {
        int [] nums = {1,3,4,1,2,3,1};
        List ans = findMatrix(nums);
        System.out.println(ans);
    }

    static List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> insideList = new ArrayList<>();
        List<Integer> currentRow = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();

        for (int K : nums) {
            elements.add(K);
        }

        int index = 0;

        while (!elements.isEmpty()) {

            // If current row already has the element -> finish this row
            if (currentRow.contains(elements.get(index))) {
                insideList.add(new ArrayList<>(currentRow));
                currentRow.clear();
                index = 0;
                continue;
            }

            // Otherwise add it to row
            currentRow.add(elements.get(index));
            elements.remove(index);

            // Reset index if reached end
            if (index >= elements.size()) {
                insideList.add(new ArrayList<>(currentRow));
                currentRow.clear();
                index = 0;
            }
        }

        return insideList;
    }
}
