package Twopointer;

public class ReverseLetterThenSpecialCharactersInAString {
    public static void main(String[] args) {
        String ans = reverseByType(")ebc#da@f(");
        System.out.println(ans);
    }

    static String reverseByType(String s) {
        StringBuilder str = new StringBuilder(s);

        int r = 0;
        int l = str.length()-1;
        while(l >= r){
            int temp = str.charAt(r);
            int temp1 = str.charAt(l);
            System.out.println(temp);
            if(!(temp >= 97 && temp <= 122)){
                r++;
            }
            else if(!(temp1 >= 97 && temp1 <= 122)){
                l--;
            }
            else{
                char k = str.charAt(r);
                str.replace(r,r+1,String.valueOf(str.charAt(l)));
                str.replace(l,l+1,String.valueOf(k));
                r++;
                l--;
            }
        }

        int r1 = 0;
        int l1 = str.length()-1;
        while(l1 >= r1){
            int temp = str.charAt(r1);
            int temp1 = str.charAt(l1);
            if(temp >= 97 && temp <= 122){
                r1++;
            }else if(temp1 >= 97 && temp1 <= 122){
                l1--;
            }else{
                char c = str.charAt(r1);
                str.replace(r1,r1+1,String.valueOf(str.charAt(l1)));
                str.replace(l1,l1+1,String.valueOf(c));
                r1++;
                l1--;
            }
        }
        return String.valueOf(str);
    }
}
