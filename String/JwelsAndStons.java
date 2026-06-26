package String;

public class JwelsAndStons {
    public static void main(String[] args) {
            int ans = numJewelsInStones("aA", "aAAbbbb");
        System.out.println(ans);
    }

    static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<stones.length(); i++){
            for(int j=0; j<jewels.length(); j++){
                char a = stones.charAt(i);
                char b = jewels.charAt(j);
                if(a == b){
                    count++;
                }
            }
        }

        return count;
    }
}
