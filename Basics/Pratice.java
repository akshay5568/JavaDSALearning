package Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Pratice {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,4,5};
        HashMap hs = new HashMap();

        for(int i=0; i<arr.length; i++){
            if(hs.containsKey(arr[i])){
                int temp = (int) hs.get(arr[i]);
                hs.put(arr[i],++temp);
            }else {
                hs.put(arr[i],0);
            }
        }
       ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if ((int)hs.get(arr[i]) == 0){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

}
