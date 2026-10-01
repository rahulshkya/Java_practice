
public class OOPs {
    //varible declaration

    public static void main(String[] args) {
        Horse h =new Horse();
        h.eat();
        h.walk();
    }
}

class pen {

    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class student {
 
    String name;
    int age;
    float percentage;

    student(Str\ing name, int age) {
        this.name = name;
        this.age = age;
    }

    void calcPercentage(int totalMarks, int marksObtained) {
        percentage = (marksObtained / (float) totalMarks) * 100;
    }
}

class bankaccount {

    public String username;
    private String password;

    void setPassword(String pwd) {
        this.password = pwd;
    }

    void getPassword() {
        System.out.println("Password: " + this.password);
    }
}
//base class
// class Animal{
//     String color;
//     void sound(){
//         System.out.println("Animal makes a sound");
//     }
//     void sleep(){
//         System.out.println("Animal sleeps");
//     }
//     void eat(){
//         System.out.println("Animal eats");
//     }
// }
// //derived class
// class Fish extends Animal{
//     int fins;

//     void Swim(){
//         System.out.println("Fish swims");
//     }
// }
// class Mammal extends Animal{
//     int legs;

//     void walk(){
//         System.out.println("Mammal walks");
//     }
// }

// class Dog extends Mammal{
//     void bark(){
//         System.out.println("Dog barks");
//     }
// }

abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

interface chess{
    void moves();

}

class king implements chess{
    void moves(){
        System.out.println("King moves one step in any direction");
    }
}


