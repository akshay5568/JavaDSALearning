package Recuersion;

public class ReversANumber {
    public static void main(String[] args) {
        int digit = 8787;
        int ans = revers(digit);
        System.out.print(ans);
    }

    static int revers(int n){
        

        return revers(n%10);
    }

}
