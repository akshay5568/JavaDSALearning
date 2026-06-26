package Arrays;

public class PartisionArrayAcording {
    public static void main(String[] args) {

    }

    static int[] pivotArray(int[] nums, int pivot) {
        int count =0;
        int [] newArr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                newArr[count] = nums[i];
                count++;
            }
        }

        for(int j=0; j<nums.length; j++){
            if(nums[j] == pivot){
                newArr[count] = nums[j];
                count++;
            }
        }

        for(int k=0; k<nums.length; k++){
            if(nums[k] > pivot){
                newArr[count] = nums[k];
                count++;
            }
        }
        return newArr;
    }
}
