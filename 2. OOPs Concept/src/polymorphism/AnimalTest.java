package polymorphism;

class Animal1 {
    void eat() {
        System.out.println("super eating...");
    }
}
class Dog1 extends Animal1 {
    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        eat();
        bark();
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.work();

    }
}
