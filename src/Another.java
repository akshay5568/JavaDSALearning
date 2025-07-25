public class Another {
    public static void main(String[] args) {
        int arr[] = {1,2,98,4,5,87};
        int count = 0;
        for (int i =0; i < arr.length; i++){
            if (arr[i] > count){
                count = arr[i];
            }
        }
        System.out.println(count);
    }
}
