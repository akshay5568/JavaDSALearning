package Arrays;

public class FindTheDistanceValue {
    public static void main(String[] args) {
        int arr [] = {4,5,8};
        int arr2 [] = {10,9,1,8};
        int ans = findTheDistanceValue(arr,arr2,2);
        System.out.println(ans);
    }

    static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for(int i=0; i<arr1.length; i++){
            int temp = 0;
            for(int j=0; j<arr2.length; j++){
                if((Math.abs(arr1[i] - arr2[j])) <= d){
                    temp = 1;
                    break;
                }
            }
            if(temp == 0) ans++;
        }
        return ans;
    }
}
