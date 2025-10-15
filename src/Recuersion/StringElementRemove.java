package Recuersion;

public class StringElementRemove {
    public static void main(String[] args) {
        String ans = RemoveElement("bbacd", 0,"", 'b');
        System.out.println(ans);
    }

    static String RemoveElement(String s, int index, String ans, char removeElement){
        if (index == s.length()){
            return ans;
        }

        if (removeElement != s.charAt(index)){
             ans += s.charAt(index);
             return RemoveElement(s,index+1, ans, removeElement);
        }
        return RemoveElement(s,index+1, ans,removeElement);
    }
}
