package Recursion;

public class CombinationItretor {
    public static void main(String[] args) {
//            CombinationIterator(0,"","chp",1);
    }


    //This is recursion code which is first create function to genrate all the specific strings which will need to use in problem to solve.
//    public static void CombinationIterator(int start,String p, String up,int length){
//        if (p.length() == length){
//            System.out.println(p);
//            return;
//        }
//
//        for (int i=start; i<up.length(); i++){
//            char ch = up.charAt(i);
//            CombinationIterator(i,p+ch,up.substring(1),length);
//        }
//    }



    //This is actual code which I wrote in Leetcode to solve this problem.
//    class CombinationIterator {
//
//        public static void Back(String p,String up, int length, int start,List<String> list){
//            if (p.length() == length){
//                list.add(p);
//                return;
//            }
//
//            for (int i=start; i<up.length(); i++){
//                char ch = up.charAt(i);
//                Back(p+ch,up.substring(1),length,i,list);
//            }
//        }
//
//        int index = 0;
//        List<String> list;
//        public CombinationIterator(String characters, int combinationLength) {
//            list = new ArrayList<>();
//            Back("",characters,combinationLength,0,list);
//        }
//
//        public String next() {
//            String temp = list.get(index);
//            index++;
//            return temp;
//        }
//
//        public boolean hasNext() {
//            if(index >= list.size()){
//                return false;
//            }else return true;
//        }
//    }

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

}
