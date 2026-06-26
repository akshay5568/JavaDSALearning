package StackAndQueues;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class RemoveAllAdjacant {
    public static void main(String[] args) {
        Hashtable<Character,Integer> mt = new Hashtable<>();
        mt.put('a',1);
        System.out.println(mt);
        int count = mt.get('a');
        mt.replace('a',++count);
        System.out.println(mt);


    }

}
