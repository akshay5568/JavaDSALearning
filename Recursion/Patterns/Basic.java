package Recursion.Patterns;

public class Basic {
    public static void main(String[] args) {
          basicPattern(4,0);
    }

    static void basicPattern(int r, int c) {
            if (r == 0) {
                return;
            }

            if (r>c) {
                System.out.print("*");
                basicPattern(r, c+1);

            }else {
                System.out.println();
                basicPattern(r-1, c);
            }
    }
}
