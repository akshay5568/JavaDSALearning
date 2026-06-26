package Sorting;

public class SortByParity2 {
    public static void main(String[] args) {

    }
    static int[] sortArrayByParityII(int[] nums) {
        int [] temp = new int [nums.length];
        int even = 0;
        int odd = 1;
        for(int num : nums){
            if(num % 2 ==0){
                temp[even] = num;
                even = even + 2;
            }else{
                temp[odd] = num;
                odd = odd + 2;
            }
        }
        return temp;
    }
}
