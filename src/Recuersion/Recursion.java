package Recuersion;

public class Recursion {
    public static void main(String[] args) {
        rec(5);
    }

    static void rec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        rec(n - 1);
        System.out.println(n);
    }
}
