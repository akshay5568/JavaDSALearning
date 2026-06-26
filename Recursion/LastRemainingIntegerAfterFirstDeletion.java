package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LastRemainingIntegerAfterFirstDeletion {
    public static void main(String[] args) {
        long ans = lastInteger(8);
        System.out.println(ans);
    }


    //These all the code versions were enough to solve this problem however I passed all the test cases.
    //Because of the worst time complexity I got TLE error. Now I have to get better time complexity.

    public static long lastInteger1(long n) {
        if(n == 1) return n;
        List<Long> list = new ArrayList<>();
        for(long i=1; i<=n; i++){
            list.add(i);
        }
        int indexCount = 0;
        System.out.println(list);
        do {
            indexCount = 0;
            int count = 1;
            List<Long> temp = new ArrayList<>();
            while (count < list.size()) {
                temp.add(list.get(count));
                count += 2;
            }

            for (Long value : temp) {
                list.remove(value);
            }
            System.out.println(list);

            temp = new ArrayList<>();
            count = 0;
            count = list.size() - 2;
            while (count >= 0) {
                temp.add(list.get(count));
                count -= 2;
            }

            for (Long aLong : temp) {
                list.remove(aLong);
            }
            System.out.println(list);
            int i = 0;
            for (i = 0; i < list.size(); i++) {
                if (list.get(i) > 0) indexCount++;
            }
        } while (indexCount != 1);
        return list.getFirst();
    }

    public static long lastInteger(long n) {
        if(n == 1) return n;
        List<Long> list = new ArrayList<>();
        for(long i=1; i<=n; i++){
            list.add(i);
        }
        System.out.println(list);

        while (list.size() != 1){
            int count = 1;
            List<Long> temp = new ArrayList<>();
            while (count < list.size()) {
                temp.add(list.get(count));
                count += 2;
            }
            list.removeAll(temp);

            System.out.println(list);

            count = 0;
            count = list.size()-2;
            while (0 <= count) {
                list.remove(list.get((int) count));
                count -= 2;
            }
        }
        return list.getFirst();
    }
}
