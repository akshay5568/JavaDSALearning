package Arrays;

public class ConsistentString {
    public static void main(String[] args) {
        String [] arr = {"badab"};
        arr(arr,"ab");
    }

    static void arr(String [] arr, String word){
        System.out.println(arr[0].contains(word));
    }
}
