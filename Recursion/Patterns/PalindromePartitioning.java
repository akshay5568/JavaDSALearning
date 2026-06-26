package Recursion.Patterns;

public class PalindromePartitioning {
    public static void main(String[] args) {
        BackTrack("aab","");
    }



    public static boolean isPalin(String temp){
        if (temp.isEmpty()) return false;
        int r = 0; int l = temp.length()-1;
        while (l >= r){
            if (temp.charAt(r) != temp.charAt(l)) return false;
            l--; r++;
        }
        return true;
    }
    public static void BackTrack(String s,String temp){
        if (isPalin(temp)) {
            System.out.println(temp);
            return;
        }
        for (int i=0; i<s.length(); i++){

        }
    }
//    public List<List<String>> partition(String s) {
//
//    }
}
