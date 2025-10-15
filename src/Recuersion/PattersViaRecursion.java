package Recuersion;

public class PattersViaRecursion {
    public static void main(String[] args) {
        basicPatter(4,0);
    }

    static void basicPatter(int r , int c){
        if (r == 0){
            return;
        }

        if (r>c){
            basicPatter(r, c+1);
            System.out.print("*");
        }else {
            basicPatter(r-1,0);     
            System.out.println();
        }
    }
}
