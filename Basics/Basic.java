package Basics;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>(2);

        Hashtable<Integer,Integer> k = new Hashtable<>();
        k.put(1,1);
        k.put(2,2);
        for (Map.Entry<Integer,Integer> entry : k.entrySet()){
            System.out.println(entry.getKey());
            entry.getValue();
        }

    }

}