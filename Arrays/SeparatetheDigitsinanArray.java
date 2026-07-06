package Arrays;

public class SeparatetheDigitsinanArray {
    public static void main(String[] args) {

    }

    public int[] separateDigits(int[] nums) {
        StringBuilder str = new StringBuilder();
        for(int i : nums){
            str.append(i);
        }

        int [] answer = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            answer[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }
}
