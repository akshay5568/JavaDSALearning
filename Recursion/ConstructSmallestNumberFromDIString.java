package Recursion;

public class ConstructSmallestNumberFromDIString {
    public static void main(String[] args) {
            String pattern = "IIIDIDDD";
            smallestNumber(pattern);
    }

    public static String smallestNumber(String pattern) {
        int count = 1;
        StringBuilder str = new StringBuilder(pattern);
        for (int i=0; i<pattern.length(); i++){
            if (pattern.charAt(i) == 'I'){
                str.replace(i,i+1,String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
        backTrak(str,pattern,0,0);
        return String.valueOf(str);
    }

    public static void backTrak(StringBuilder str,String pattern,int DCount,int index){
        if (index > pattern.length()) return;
        if (pattern.charAt(index) == 'D'){
            if (isValid(str,index,pattern,DCount)){
                str.replace(index,index+1,String.valueOf(DCount));
                backTrak(str, pattern, DCount + 1, index + 1);
            }else backTrak(str,pattern,DCount+1,index);
        }
        backTrak(str, pattern, DCount, index + 1);
    }

    public static boolean isValid(StringBuilder str, int index, String pattern,int DCount){
        if (index+1 >= pattern.length()) return false;
        for(int i=0; i<pattern.length()-1; i++){
             if (pattern.charAt(i) == 'I'){
                 if (!(str.charAt(i) < str.charAt(i+1))) return false;
             }else {
                 if (!(str.charAt(i) > str.charAt(i+1))) return false;
             }
         }
        if (Character.isDigit(str.charAt(index+1)) && DCount > (str.charAt(index+1) - '0')) return true;
        else if (str.charAt(index+1) == 'D') {

        }
        else return false;
    }
}
