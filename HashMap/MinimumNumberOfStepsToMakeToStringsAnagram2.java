package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfStepsToMakeToStringsAnagram2 {
    public static void main(String[] args) {

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


        //We have solved this kind of same problem before but in this problem also have to count char diffrance from T strings. Therefore I have added this another looop.
        for(Map.Entry<Character,Integer> entry : forT.entrySet()){
            if(!forS.containsKey(entry.getKey())) count += entry.getValue();
            else {
                int temp = forS.get(entry.getKey());
                if(temp < entry.getValue()) count += entry.getValue() - temp;
            }
        }
        return count;
    }
}
