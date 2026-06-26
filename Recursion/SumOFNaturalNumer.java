package Recursion;

public class SumOFNaturalNumer {
    public static void main(String[] args) {
        int number = 5;
        int ans = sum(number);
        System.out.println(ans);
    }

    static int sum(int number){
         if(number < 0){
             return 0;
         }
         return number + sum(number-1);
    }
}
