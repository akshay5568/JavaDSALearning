package HASHTABLE;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 3749;
        String ans = intToRoman(num);
        System.out.println(ans);
    }

    static String intToRoman(int num) {
        int [] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};


        StringBuilder str = new StringBuilder();
        for(int i=0; i<values.length; i++){
            while(num >= values[i]){
                str.append(symbol[i]);
                num -= values[i];
            }
        }

        return String.valueOf(str);
    }
}
