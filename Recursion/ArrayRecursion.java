package Recursion;

public class ArrayRecursion {
    public static void main(String[] args) {
        int [] nums = {1,2,3,98,5,87};
        int target = 0;
        int ans = isElement(nums, target, 0);
        System.out.println(ans);
    }

    static int isElement(int [] arr, int target, int index){
        if (arr[index]== target) {
            return index;
        }
        if (arr.length - 1 == index) {
            if (arr[index] == target) {
                return index;
            }else return -1;
        }

        return isElement(arr, target, index+1);
    }
}
