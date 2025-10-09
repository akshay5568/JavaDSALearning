package Searching;
//This is Basic problem of linear search.
public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,87,98,654,343,434};
        int target = 87;
        int ans = Linear(arr, target);
        System.out.print(ans);
    }

    static int Linear(int [] arr, int target){
        for(int i =0; i<arr.length; i++){
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    } 
}
