package Recursion.Patterns;

public class Purmetation {
    public static void main(String[] args) {

            String str = "abc";
//          purmeutation(str,"");
          int index = 0;
          int a = 60;
          int b = 36;
          if (a > b){
              index = a/2;
          }else index = b/2;
          int ans = 0;
          for (int i=1; i<=index; i++){
              if (a % i == 0 && b % i ==0) ans = i;
          }
        System.out.println(ans);
    }

//    static void purmeutation(String str, String st){
//            if (str.isEmpty()) System.out.println(st);
//            else {
//                for (int  i=0; i<str.length(); i++){
//                    char ch = str.charAt(i);
//                    String remaining = str.substring(0,i) + str.substring(i+1);
//                    purmeutation(remaining,st+ch);
//                }
//            }
//    }
}
