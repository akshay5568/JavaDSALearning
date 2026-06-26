package Twopointer;

public class RemeovePlaindromeSubString {
    public static void main(String[] args) {
        String s = "abb";
        int ans = removePalindromeSub(s);
        System.out.println(ans);
    }

    static int removePalindromeSub(String s) {
        StringBuilder st = new StringBuilder(s);

        int count = 0;
        for(int i=0; i<=st.length(); i++){
            for(int j=0; j<st.length(); j++){
                boolean isValid;
                if (j+2 < st.length()){
                     isValid = isPalin(st.substring(i,j+2));
                    if(isValid){
                        count++;
                        st.replace(i-1,j+2,"");
                        i = 0;
                        break;
                    }
                }else {
                    isValid = isPalin(st.substring(i,j+1));
                    if(isValid){
                        count++;
                        st.replace(i-1,j+1,"");
                        i = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(st);
        System.out.println(st.length());
        return count;
    }
    static boolean isPalin(String str){
        int i =0;
        int j =str.length()-1;
        while(j >= i){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
