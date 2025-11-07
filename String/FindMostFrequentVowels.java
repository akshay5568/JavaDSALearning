package String;

public class FindMostFrequentVowels {
    public static void main(String[] args) {
        String str = "successes";
        int ans = maxFreqSum(str);
        System.out.println(ans);
    }


        static int maxFreqSum(String s) {
            String vowels[] = {"a", "e", "i", "o", "u"};
            s = s.toLowerCase();
            int vowelsCount = 0;


            for (int i = 0; i < vowels.length; i++) {
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    String cha = String.valueOf(s.charAt(j));
                    if (cha.equals(vowels[i])) {
                        count++;
                    }
                }
                if (vowelsCount < count) {
                    vowelsCount = count;
                }
            }


            String vowelsString = "aeiou";
            int constantCount = 0;

            for (char c = 'a'; c <= 'z'; c++) {
                if (!vowelsString.contains(String.valueOf(c))) {
                    int count = 0;
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) == c) {
                            count++;
                        }
                    }
                    if (constantCount < count) {
                        constantCount = count;
                    }
                }
            }


            int ans = constantCount + vowelsCount;
            return ans;

    }

}
