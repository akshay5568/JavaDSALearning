package Recursion;

public class FindTheKthCharacterInAStringGame {
    public static void main(String[] args) {
        char ans = kthCharacter(5);
        System.out.println(ans);
    }

    //This is Itretive approach of this problem.
//    public static char kthCharacter(int k) {
//        StringBuilder st = new StringBuilder("a");
//        while(!(st.length() > k)){
//            int temp = st.length();
//            for(int i=0; i<temp; i++){
//                char ch = st.charAt(i);
//                st.append(++ch);
//            }
//        }
//        return st.charAt(k);
//    }


    //This is Recursion approach of this problem.
    public static char kthCharacter(int k){
        StringBuilder st = new StringBuilder("a");
        recursionTask(k,st);
        return st.charAt(k-1);
    }

    public static void recursionTask(int k, StringBuilder st){
        int temp = st.length();
        for (int i=0; i<temp; i++){
            char ch = st.charAt(i);
            st.append(++ch);
        }
        if (st.length()>k) return;
        else recursionTask(k,st);
    }
}
