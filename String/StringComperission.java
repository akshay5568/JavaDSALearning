package String;

public class StringComperission {
    public static void main(String[] args) {
      char [] chars = {'a','a','b','b','c','c','c'};
      int ans = compress(chars);
        System.out.println(ans);
    }

    static int compress(char[] chars) {
        if(chars.length == 1) return 1;
        StringBuilder str = new StringBuilder();
        int count = 1;
        for(int i=0; i<chars.length; i++){
            while(i+1 < chars.length && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            str.append(chars[i]);
            if(count > 1){
                str.append(count);
            }
            count = 1;
        }
        for(int j=0; j<str.length(); j++){
            chars[j] = str.charAt(j);
        }
        return str.length();
    }
}
