package String;

import java.util.Arrays;

public class SortThePeople {
    public static void main(String[] args) {
         String [] str = sortPeople(new String[]{"Mary", "John", "Emma"},new int[] {180,165,170});
        System.out.println(Arrays.toString(str));
    }

    static String[] sortPeople(String[] names, int[] heights) {
        for(int i =0; i<heights.length; i++){
            for(int j=1; j<heights.length; j++){
                if(heights[j-1] < heights[j]){
                    int temp = heights[j-1];
                    heights[j-1] = heights[j];
                    heights[j] = temp;

                    String temp1 = names[j-1];
                    names[j-1] = names[j];
                    names[j] = temp1;
                }
            }
        }
        return names;
    }
}
