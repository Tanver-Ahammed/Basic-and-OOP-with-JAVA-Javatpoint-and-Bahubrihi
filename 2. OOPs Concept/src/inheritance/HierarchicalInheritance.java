package inheritance;

//super class
class Animal2{
    void eat(){
        System.out.println("A animal is eating!!");
    }
}
//sub class
class Dog2 extends Animal2{
    void bark(){
        System.out.println();
        eat();
        System.out.println("A dog is barking!!");
    }
}
//another sub class
class Cat extends Animal2{
    void meow(){
        System.out.println();
        eat();
        System.out.println("A dog is meowing!!");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        Cat cat = new Cat();
        new Animal2().eat();
        dog2.bark();
        cat.meow();
    }
}
