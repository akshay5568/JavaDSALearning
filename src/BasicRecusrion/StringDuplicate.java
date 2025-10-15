package BasicRecusrion;

public class StringDuplicate {
    public static void main(String[] args) {
        String str = "apnacollage";
        StringBuilder ans = RemoveDuplicate(str);
        System.out.println(ans);
    }

    static StringBuilder RemoveDuplicate (String str){
        StringBuilder newString = new StringBuilder("w");
        int count = 0;
        for(int i =1; i<str.length(); i++){
            for (int j=0; j<i; j++){
                if (str.charAt(j) != str.charAt(i)){
                    if (newString.charAt(count) != str.charAt(j)){
                        newString.append(str.charAt(j));
                        count++;
                    }
                }
            }
        }
        return newString;
    }
}
