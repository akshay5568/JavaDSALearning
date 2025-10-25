package Arrays;

public class RestoringFinishingOrder {
    public static void main(String[] args) {

    }

    static int[] recoverOrder(int[] order, int[] friends) {
        int [] newArr = new int[friends.length];
        int count = 0;
        for(int i=0; i<order.length; i++){
            for(int j=0; j<friends.length; j++){
                if(order[i] == friends[j]){
                    newArr[count] = order[i];
                    count++;
                }
            }
        }
        return newArr;
    }
}
