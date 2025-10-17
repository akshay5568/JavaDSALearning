package String;

public class MaximumReaptingString {
    public static void main(String[] args) {
        int ans = maxRepeating("a","b");
        System.out.println(ans);
    }

    static int maxRepeating(String sequence, String word) {
        int count = 0;
        if (sequence.isEmpty()){
            return 0;
        }
        if(sequence.length() == 1){
            if (sequence.equals(word)){
                return 1;
            }else {
                return count;
            }
        }

        for (int i=2; i<=sequence.length(); i++){
            if (sequence.substring(i - 2, i).equals(word)){
                count++;
            }
        }
        return count;
    }
}
