class supers{
public static void main(String[] args) {
        Dog d = new Dog();
    }}


class Animal{
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog constructor is called");
    }
}

class color{
    String color;
}

class shirt extends color{
    super.color = "red";
    
}