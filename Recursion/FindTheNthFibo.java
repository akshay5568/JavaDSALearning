package Recursion;

public class FindTheNthFibo {
    public static void main(String[] args) {
            int digit = 6;
            int ans = fibo(digit);
        System.out.println(ans);
    }

    static int fibo(int number){
          if(number <= 1){
              return number;
          }
           return fibo(number-1) + fibo(number-2);
    }
}
