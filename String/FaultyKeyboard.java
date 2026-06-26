package String;

public class FaultyKeyboard {
    public static void main(String[] args) {

    }

    static String finalString(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'i'){
                str.reverse();
            }else{
                str.append(String.valueOf(s.charAt(i)));
            }
        }
        return String.valueOf(str);
    }
}

