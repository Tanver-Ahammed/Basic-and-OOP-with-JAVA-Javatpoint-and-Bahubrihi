package polymorphism;

class Animal2{
    String color="white";
}
class Dog extends Animal2{
    String color="Black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class SuperKeys {
    public static void main(String[] args) {
        new Dog().printColor();
    }
}
