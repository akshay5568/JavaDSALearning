package HashMap;

import java.util.HashMap;
import java.util.Map;

public class DigitFrequancyStore {
    public static void main(String [] args){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){

        }
    }

    //Very bad time & space complexity.
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        String Str = String.valueOf(n);
        for(int i=0; i<Str.length(); i++){
            if(hm.containsKey(Integer.parseInt(String.valueOf(Str.charAt(i))))){
                int index = hm.get(Integer.parseInt(String.valueOf(Str.charAt(i))));
                hm.put(Integer.parseInt(String.valueOf(Str.charAt(i))),++index);
            }else {
                hm.put(Integer.parseInt(String.valueOf(Str.charAt(i))),1);
            }
        }

        int answer = 0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            answer += entry.getValue() * entry.getKey();
        }

        return answer;
    }

    //Second approach to solve this problem and Improved a lot runtime % after this soluction.
    public int digitFrequencyScore1(int n) {
        int answer = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(n != 0){
            int temp = n % 10;
            if(hm.containsKey(temp)){
                int val = hm.get(temp);
                hm.put(temp,++val);
            }else {
                hm.put(temp,1);
            }
            n = n / 10;
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            answer += entry.getKey() * entry.getValue();
        }
        return answer;
    }

    //Most eficient approach to solve this problem.
    public int digitFrequencyScore2(int n) {
        int answer = 0;
        while(n != 0){
            int temp = n % 10;
            answer += temp;
            n = n / 10;
        }
        return answer;
    }
}
