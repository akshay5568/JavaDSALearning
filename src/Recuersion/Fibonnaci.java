package Recuersion;

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 4;
        int ans = fibo(n);
        System.out.print(ans);
    }


    static int fibo(int n){
         if(n<=1){
             return n;
         }
         return fibo(n - 1) + fibo(n-2);
    }
}
