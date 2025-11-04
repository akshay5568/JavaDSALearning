package OOPS.Interfaces;

interface Sum{
     void sum();
}

interface Sum2{
    void sum();
    void sum(int a , int b);
}

class ImplementInterfece implements Sum,Sum2{
      public void sum(){
          System.out.println("Hello From ImplementInterfece");
      }

    @Override
    public void sum(int a, int b) {
        System.out.println(a + b);
    }
}


public class BasicImplement {
    public static void main(String[] args) {
        ImplementInterfece ic  = new ImplementInterfece();
        ic.sum();
        ic.sum(5,5);
    }
}
