package String;

public class MaximumReaptingString {
    public static void main(String[] args) {
        int ans = maxRepeating("ababc","ba");
        System.out.println(ans);
    }

    static int maxRepeating(String sequence, String word) {
        int count = 0;
        for (int i=0; i<sequence.length(); i++){
            int str = sequence.indexOf(word,i);
            if (str != -1){
                count++;
            }
        }
       return count;
    }
}
