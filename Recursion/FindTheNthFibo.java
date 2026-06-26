package Recursion;

public class FindTheNthFibo {
    public static void main(String[] args) {
            int digit = 4;
            int ans = fibo2(digit);
        System.out.println(ans);
    }

    static int fibo(int number){
          if(number <= 1){
              return number;
          }
           return fibo(number-1) + fibo(number-2);
    }

    static int fibo2(int num){
        if (num <= 1) return num;
        int last = fibo2(num-1);
        int sLast = fibo2(num-2);
        return last + sLast;
    }
}
