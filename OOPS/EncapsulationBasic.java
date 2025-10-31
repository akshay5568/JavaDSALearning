package OOPS;

public class EncapsulationBasic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Aditya");
        System.out.println(s1.getName());
    }
}

class Student{
    private String name;
    private int age;
    private String grade;

    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    String getGrade(){
        return this.grade;
    }


    void setName(String name){
        this.name  = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setGrade(String grade){
        this.grade = grade;
    }
}
