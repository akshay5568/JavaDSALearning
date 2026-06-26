package Recursion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddictiveNumbers {
    public static void main(String[] args) {
        System.out.println(isAdditiveNumber("1023"));
    }

    public static boolean isAdditiveNumber(String num) {
         return isAddictiveNum(num,0,new ArrayList<>());
    }

    public static boolean isAddictiveNum(String num, int index, List<String> ans){
        if (index == num.length() && ans.size() >= 3){
            return true;
        }
        for (int i=index; i<num.length(); i++){
                if (index != i && num.charAt(index) == '0') break;
                String element = num.substring(index,i+1);
                 BigInteger a = new BigInteger("");
                 BigInteger b = new BigInteger("");
            if (ans.size() <= 1) {
                    a  = new BigInteger(ans.getLast());
                    b = new BigInteger(ans.get(ans.size()-2));
                }
                if (ans.size() <= 1 || element.equals(
                        String.valueOf(
                             a.add(b)
                ))){
                    ans.add(element);
                    if (isAddictiveNum(num,i+1,ans)){
                        return true;
                    }
                    ans.removeLast();
                }
        }
        return false;
    }

}
