package inheritance;

//super class
class Animal{
    void eat(){
        System.out.println("A animal is eating!!");
    }
}
//sub class
class Dog extends Animal{
    void bark(){
        System.out.println();
        eat();
        System.out.println("A dog is barking!!");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();

        dog.bark();

    }
}
