package Recuersion;

public class Factorial {
    public static void main(String[] args) {
        int n =10;
        int ans = Fatc(n);
        System.out.print(ans);
    }

    static int Fatc(int n){
        if (n == 0){
            return 1;
        }
        return n * Fatc(n-1);
    }
}
