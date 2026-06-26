package LinkedList;
import java.math.BigInteger;

public class AddTowNumbers {
    public static void main(String[] args) {

    }


        static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            BigInteger total;
            StringBuilder str = new StringBuilder();
            StringBuilder str1 = new StringBuilder();
            while(l1 != null){
                str.append(l1.val);
                l1 = l1.next;
            }
            while(l2 != null){
                str1.append(l2.val);
                l2 = l2.next;
            }
            str.reverse();
            str1.reverse();
            BigInteger a1 = new BigInteger(String.valueOf(str));
            BigInteger a2 = new BigInteger(String.valueOf(str1));
            total = a1.add(a2);
            String ansStr = String.valueOf(total);
            ListNode ans = new ListNode();
            ListNode ans1 = ans;
            for(int i=ansStr.length()-1; i>=0; i--){
                ans.next = new ListNode(Integer.parseInt(String.valueOf(ansStr.charAt(i))));
                ans = ans.next;
            }
            return ans1.next;
        }
}
