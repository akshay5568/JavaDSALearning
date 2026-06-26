package Twopointer;

public class ContainersWithMostWater {
    public static void main(String[] args) {

    }

    static int maxArea(int[] height) {
        int left  = 0;
        int right = height.length-1;
        int maxC = 0;

        while (right > left){
            int temp = right - left;
            int min = Math.min(height[right],height[left]);
            maxC = Math.max(maxC,temp * min);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxC;
    }
}
