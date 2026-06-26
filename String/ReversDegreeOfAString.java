package String;

public class ReversDegreeOfAString {
    public static void main(String[] args) {
         String a = "abc";
         int ans = reverseDegree(a);
        System.out.println(ans);
    }

    static int reverseDegree(String s) {
        int finalAns = 0;
        for(int i=0; i<s.length(); i++){
            int temp = (int) s.charAt(i);
            int index = 122 - temp + 1;
            finalAns = finalAns + index * (i+1);
        }
        return finalAns;
    }
}
