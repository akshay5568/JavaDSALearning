package Arrays;

public class SmallestEvenMultiply {
    public static void main(String[] args) {
        int n = 6;
        int ans = smallestEvenMultiple(n);
        System.out.println(ans);
    }
    static int smallestEvenMultiple(int n) {
        int i =1;
        int ans = 0;
        while(true){
            boolean isFalse = false;
            int temp = i * n;
            int temp2 = 0;
            i++;
            int j = 1;
            while(!(temp2 > temp)){
                if(temp == temp2){
                    ans = temp;
                    isFalse = true;
                    break;
                }
                temp2 = 2 * j;
                j++;
            }
            if(isFalse) break;
        }
        return ans;
    }
}
