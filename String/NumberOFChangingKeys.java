package String;

public class NumberOFChangingKeys {
    public static void main(String[] args) {

    }

    static int countKeyChanges(String s) {
        int count = 0;
        for(int i=1; i<s.length(); i++){
            if(s.toLowerCase().charAt(i-1) != s.toLowerCase().charAt(i)){
                count++;
            }
        }
        return count;
    }
}
