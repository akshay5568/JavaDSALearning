package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfStepsToMakeTowStringsAnagram {
    public static void main(String[] args) {
        int ans  = minSteps("gctcxyuluxjuxnsvmomavutrrfb","qijrjrhqqjxjtprybrzpyfyqtzf");
        System.out.println(ans);
    }

    public static int minSteps(String s, String t) {
        HashMap<Character,Integer> forS = new HashMap<>();
        HashMap<Character,Integer> forT = new HashMap<>();


        for(char c : s.toCharArray()){
            if(!forS.containsKey(c)) forS.put(c,1);
            else {
                int temp = forS.get(c);
                forS.put(c,++temp);
            }
        }

        for(char c : t.toCharArray()){
            if(!forT.containsKey(c)) forT.put(c,1);
            else {
                int temp = forT.get(c);
                forT.put(c,++temp);
            }
        }

        System.out.println(forS);
        System.out.println(forT);

        int count =0;
        for(Map.Entry<Character,Integer> entry : forS.entrySet()){
            if(!forT.containsKey(entry.getKey())) count += entry.getValue();
            else {
                int temp = forT.get(entry.getKey());
                if(temp < entry.getValue()) count += entry.getValue() - temp;
            }
        }
        return count;
    }

}
