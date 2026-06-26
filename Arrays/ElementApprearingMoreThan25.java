package Arrays;

public class ElementApprearingMoreThan25 {
    public static void main(String[] args) {
        int [] arr  = {1,1,1,1,1,2,3,4,5,6,12,12,12,12};
        int ans = findSpecialInteger(arr);
        System.out.println(ans);
    }

    static int findSpecialInteger(int[] arr) {
        int ans = arr[0];
        int count1 = 0;
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=1+i; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count1 < count){
                count1 = count;
                ans = arr[i];
            }
        }
        return ans;
    }
}
