package Strings;

public class IPAddresseString {
    public static void main(String[] args) {
            String str = "1.1.1.1";
            String ans = defangIPaddr(str);
        System.out.println(ans);
    }

    static String defangIPaddr(String address) {
           return address.replace(".","[.]");
    }
}
