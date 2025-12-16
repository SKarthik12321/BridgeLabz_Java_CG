//Default - no parameters, same name as the class, no return type


package Concepts.OOPS.constructors;

public class defaults {
    String name;
    int age;
    public defaults(){
        name = " unknown";
        age = 0;
        System.out.println("Default Constructor");
    }
    void display(){
        System.out.println("Display" + name + " " + age);
    }

    public static void main(String[] args) {
        defaults s1 = new defaults();
        s1.display();
    }


}
