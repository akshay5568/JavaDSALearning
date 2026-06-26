package Twopointer;

public class ReversLettersOnly {
    public static void main(String[] args) {
        String ans = reverseOnlyLetters("a-bC-dEf-ghIj");
        System.out.println(ans);
    }

    static String reverseOnlyLetters(String s) {
        StringBuilder str = new StringBuilder(s);
        int r = 0;
        int l = str.length()-1;
        while(l >= r){
            int temp = str.charAt(r);
            int temp1 = str.charAt(l);
            if(!(temp >= 97 && temp <= 122) && !(temp >= 65 && temp <= 90)){
                r++;
            }else if(!(temp1 >= 97 && temp1 <= 122) && !(temp1 >= 65 && temp1 <= 90)){
                l--;
            }else{
                char c = str.charAt(r);
                str.replace(r,r+1,String.valueOf(str.charAt(l)));
                str.replace(l,l+1,String.valueOf(c));
                l--;
                r++;
            }
            System.out.println(str);
        }
        return String.valueOf(str);
    }
}
