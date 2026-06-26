package String;

public class CheckIfPanagram {
    public static void main(String[] args) {
        boolean ans  = checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println(ans);
    }

    static boolean checkIfPangram(String s){
        char a = 'a';
        for(int i=1; i<=26; i++){
           boolean isContain = s.contains(String.valueOf(a++));
           if (!isContain) return false;
        }
        return true;
    }
}
