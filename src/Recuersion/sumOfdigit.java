package Recuersion;

public class sumOfdigit {
    public static void main(String[] args) {
        int n = 1342;
        int ans = DigitSum(n);
        System.out.print(ans);
    }

     static int DigitSum(int n){
         if (n == 0){
             return 0;
         }

         return (n%10) + DigitSum(n/10);
    }
}
