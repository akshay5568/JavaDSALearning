package Arrays;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
    }
}

class RandomizedSet {
    Hashtable<Integer,Integer> Set;
    ArrayList <Integer> list;
    public RandomizedSet() {
        list = new ArrayList<>();
        Set = new Hashtable<>();
    }

    public boolean insert(int val) {
        if(Set.containsKey(val)){
            return false;
        }else{
            list.add(val);
            Set.put(val,list.size() - 1);
            return true;
        }
    }

    public boolean remove(int val) {
        if(Set.containsKey(val)){
            int index = Set.get(val);
            list.set(index, list.get(list.size() - 1));
            Set.put(list.get(index), index);
            list.remove(list.size() - 1);
            Set.remove(val);
            return true;
        }else{
            return false;
        }
    }

    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}
