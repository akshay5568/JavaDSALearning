package String;

public class IPAddresseString {
    public static void main(String[] args) {
          String ans = defangIPaddr("1.1.1.1");
        System.out.println(ans);
    }

    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

