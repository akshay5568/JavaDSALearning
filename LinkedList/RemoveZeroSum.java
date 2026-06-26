package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class RemoveZeroSum {
    public static void main(String[] args) {
       int [] str = {5,-3,-4,1,6,-2,-5};
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();

        for(int i : str){
            list.add(i);
            list1.add(i);
        }
        for(int i=0; i<list.size(); i++){
            System.out.println(list);
            for(int j=1+i; j<list.size(); j++){
                if(list.get(i) + list.get(j) == 0){
                    list.remove(j);
                    list.remove(i);
                    i = 0;
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
