//package LinkedList.DoublyLinkedList;
//
//public class DesignBrowserHistory {
//    static class doubleLink{
//        String str;
//        doubleLink left;
//        doubleLink right;
//        static int index;
//
//        doubleLink(String str){
//            this.str = str;
//            this.left = null;
//            this.right = null;
//            index++;
//        }
//
//        doubleLink root;
//        doubleLink temp = root;
//
//        void visit(String url){
//            doubleLink prev = null;
//            for(int i = 0; i< doubleLink.index; i++){
//                if(temp != null){
//                    prev = temp;
//                    temp = temp.right;
//                }
//            }
//            System.out.println(doubleLink.index);
//            temp = new doubleLink(url);
//            temp.left = prev;
//        }
//
//        String back(int steps) {
//            doubleLink temp = root;
//            doubleLink.index = doubleLink.index - steps;
//            for(int i = 0; i< doubleLink.index; i++){
//                if(temp != null){
//                    temp = temp.left;
//                }
//            }
//            return temp.str;
//        }
//
//        String forward(int steps) {
//            doubleLink temp = root;
//            if(doubleLink.index < steps){
//                return temp.str;
//            }else{
//                doubleLink.index = doubleLink.index + steps;
//                for(int i = 0; i< doubleLink.index; i++ ){
//                    if(temp != null){
//                        temp = temp.right;
//                    }
//                }
//                return temp.str;
//            }
//        }
//    }
//
//
//
//
//
//
//    public static void main(String[] args) {
//        doubleLink dd = new doubleLink("leetcode.com");
//        dd.visit("Google");
//        dd.visit("Facebook");
//        dd.visit("Youtube");
//        System.out.println(dd.back(1));
//    }
//
//}

//This is my version first I tried to solve myself because before never solved doubly linkedlist problem so made mistake in logic.




//
//
//class Node {
//    Node left,right;
//    String str;
//
//    Node(String str){
//        this.str = str;
//    }
//}
//
//class BrowserHistory {
//    Node current;
//
//    public BrowserHistory(String homepage) {
//        current = new Node(homepage);
//    }
//
//    public void visit(String url) {
//        Node newNode = new Node(url);
//        current.right = null;
//
//        newNode.left = current;
//        current.right = newNode;
//        current = newNode;
//    }
//
//    public String back(int steps) {
//        while(steps > 0 && current.left != null){
//            current = current.left;
//            steps--;
//        }
//        return current.str;
//    }
//
//    public String forward(int steps) {
//        while(steps > 0 && current.right != null){
//            current = current.right;
//            steps--;
//        }
//        return current.str;
//    }
//}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
