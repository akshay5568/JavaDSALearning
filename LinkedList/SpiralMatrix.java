package LinkedList;

public class SpiralMatrix {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//    public int[][] spiralMatrix(int m, int n, ListNode head) {
//        int [][] ans = new int [m][n];
//        for(int i=0; i<ans.length; i++){
//            for(int j=0; j<ans[i].length; j++){
//                ans[i][j] = -1;
//            }
//        }
//
//        ListNode temp = head;
//        int top = 0;
//        int left = 0;
//        int right = n-1;
//        int bottom = m-1;
//
//        while(temp != null){
//            for(int i=left; i<=right && temp != null; i++){
//                ans[top][i] = temp.val;
//                temp = temp.next;
//            }
//            top++;
//            for(int j=top; j<=bottom && temp != null; j++){
//                ans[j][right] = temp.val;
//                temp = temp.next;
//            }
//            right--;
//
//            for(int i=right; i>=left && temp != null; i--){
//                ans[bottom][i] = temp.val;
//                temp = temp.next;
//            }
//            bottom--;
//
//            for(int j=bottom; j>= top && temp != null; j--){
//                ans[j][left] = temp.val;
//                temp = temp.next;
//            }
//            left++;
//        }
//        return ans;
//    }
}
