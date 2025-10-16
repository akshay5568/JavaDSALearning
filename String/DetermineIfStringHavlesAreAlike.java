package String;

public class DetermineIfStringHavlesAreAlike {
    public static void main(String[] args) {
        String str = "book";
       boolean ans= halvesAreAlike(str);
        System.out.println(ans);
    }

    static boolean halvesAreAlike(String s) {
        char vowels [] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String a = "";
        String b = "";
        for (int i =0; i<s.length() / 2; i++){
              a+=s.charAt(i);
        }

        for (int j =s.length()/2; j<s.length(); j++){
            b+=s.charAt(j);
        }


        int A = 0;
        int B = 0;
        for (int p =0; p<vowels.length; p++){
            for (int j=0; j<a.length(); j++){
                char ch1 = a.charAt(j);
                char ch2 = b.charAt(j);
                if (ch1 == vowels[p]){
                    A++;
                }
                if (ch2 == vowels[p]){
                    B++;
                }
            }
        }

        return A==B;
    }
}
