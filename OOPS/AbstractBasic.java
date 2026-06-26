package OOPS;

public class AbstractBasic {
    public static void main(String[] args) {
            Shape s1 = new Circle(5);
            Shape s2 = new Rectangle(5,3);
            s1.display();
            s1.area();

            s2.display();
            s2.area();
    }
}

abstract class Shape{
    abstract void area();

    void display(){
        System.out.println("Calculation Area...");
    }
}


class Circle extends Shape{
    float readius;
    Circle(int readius){
         this.readius = readius;
    }

    void area(){
        System.out.println(Math.PI * readius * readius);
    }
}

class Rectangle extends Shape{
    int leangth;
    int width;

    Rectangle(int leangth,int width){
        this.leangth = leangth;
        this.width = width;
    }

    void area(){
        System.out.println(leangth * width);
    }
}
