package LinkedList;

import java.util.Arrays;

public class ArrayListManual {
    public static void main(String[] args) {
        Arraylist a1 = new Arraylist();
        a1.add(5);
        a1.display();

    }
}

class Arraylist{
     int count = 10;
     int [] temp = new int[count];
     int addCounter = 0;

     void add(int add){
         if(count == temp.length){
              count = count * 2;
             temp[addCounter] = add;
             addCounter++;

             return;
         }
         temp[addCounter] = add;
         addCounter++;

     }

     int getElementByIndex(int index){
          return temp[index];
     }

     void display(){
         System.out.print(Arrays.toString(temp));
     }

     void addElementIndex(int index,int element){
          if(index > temp.length){
              System.out.println("Index does not exist");
          }
          temp[index] = element;
     }

}
