package Arrays;

import java.util.ArrayList;

public class BaseballGame {
    public static void main(String[] args) {
        String [] arr = {"5","-2","4","C","D","9","+","+"};
        int ans = calPoints(arr);
        System.out.println(ans);
    }

    static int calPoints(String[] operations) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("D")){
                list.add(list.getLast()*2);
            }
            else if(operations[i].equals("C")){
                list.removeLast();

            }else if (operations[i].equals("+")){
                 int last = list.getLast();
                 int index = list.lastIndexOf(last);
                System.out.println("Index : " + last + " " + index);
                 int secondlast = list.get(index-1);
                 list.add(last+secondlast);
            }else {
                list.add(Integer.parseInt(operations[i]));
            }
            System.out.println(list);
        }
        System.out.println(list);
        int ans = 0;
        for (Integer integer : list) {
            ans += (int) integer;
        }
        return ans;
    }
}
