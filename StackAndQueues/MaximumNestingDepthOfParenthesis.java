package StackAndQueues;

public class MaximumNestingDepthOfParenthesis {
    public static void main(String[] args) {

    }

    public int maxDepth(String s) {
        int count = 0;
        int temp = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                temp++;
            }
            if(s.charAt(i) == ')'){
                count = Math.max(temp,count);
                temp--;
            }
        }
        return count;
    }
}
