package Recursion;

public class FactorialUsingRec {
    public static void main(String[] args) {
            int number = 4;
            int ans = Fact(number);
        System.out.println(ans);
    }

    static int Fact(int number){
          if(number < 1){
              return 1;
          }
          int i = Fact(number-1);
          return number * i;
    }
}
