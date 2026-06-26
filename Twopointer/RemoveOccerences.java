package Twopointer;

public class RemoveOccerences {
    public static void main(String[] args) {

    }

    static String removeOccurrences(String s, String part) {
        int r = part.length()-1;
        int l = 0;
        StringBuilder st = new StringBuilder(s);
        while(st.length() > r){
            String temp = st.substring(l,r+1);
            if(temp.equals(part)){
                st.replace(l,r+1,"");
                r = part.length()-1;
                l = 0;
                continue;
            }
            r++;
            l++;
        }
        return String.valueOf(st);
    }
}
