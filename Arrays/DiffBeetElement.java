package Arrays;

public class DiffBeetElement {
    public static void main(String[] args) {
        int [] ans = {1,15,6,3};
        int anss = differenceOfSum(ans);
        System.out.println(anss);
    }

    static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int i=0; i<nums.length; i++){
            elementSum += nums[i];
        }
        for(int j=0; j<nums.length; j++){
            String [] str = new String[nums.length];
            for(int h=0; h<nums.length; h++){
                 str[h] = String.valueOf(nums[h]);
            }
            if(str[j].length() > 1){
                for(int i=0; i<str[j].length(); i++){
                    digitSum += str[j].charAt(i) - '0';
                }
            }else{
                digitSum += Integer.parseInt(str[j]);
            }
        }
        return elementSum - digitSum;
    }
}
