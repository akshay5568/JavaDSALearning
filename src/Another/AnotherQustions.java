package Another;

public class AnotherQustions {
    public static void main(String[] args) {
        boolean ans  = palindrom(-121);
        System.out.println(ans);
    }

    static boolean palindrom(int x ){
        if (0 > x){
            return false;
        }
        String str = String.valueOf(x);
        String revers = "";

        for (int i = str.length()-1; i >= 0; i--){
            revers = revers + str.charAt(i);
        }
        x = Integer.parseInt(str);
        long ReversInt = Long.parseLong(revers);
        return x == ReversInt;
    }
}
