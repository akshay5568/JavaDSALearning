package Arrays;

public class CountIntegersWithEvenDigitSum {
    public static void main(String[] args) {

    }

    public int countEven(int num) {
        int count = 0;

        for(int i=1; i<=num; i++){
            if(isDigitEven(i)){
                count++;
            }
        }
        return count;
    }

    public boolean isDigitEven(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum % 2 == 0;
    }
}
