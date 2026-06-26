package String;

public class CountTheNumberOfConsistentString {
    public static void main(String[] args) {
        String str = "cad";
        int ans = countConsistentStrings(str,new String []{"cc","acd","b","ba","bac","bad","ac","d"});
        System.out.println(ans);
    }

    static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean is = false;
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(allowed.contains(String.valueOf(words[i].charAt(j)))){
                    is = true;
                }else{
                    is = false;
                    break;
                }
            }
            if(is) count++;
        }
        return count;
    }
}
