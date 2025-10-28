package OOPS;

public class SumOFInteger {
    public static void main(String[] args) {
            Complex c = new Complex(10,10);
        System.out.println(c.Sum());
    }


}

class Complex{
    int a;
    int b;

    Complex(int a, int b){
            this.a = a;
            this.b = b;
    }

    int Sum(){
        return a + b;
    }
}
