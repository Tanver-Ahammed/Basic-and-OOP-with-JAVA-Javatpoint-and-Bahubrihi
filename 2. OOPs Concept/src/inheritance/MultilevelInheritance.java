package inheritance;

//super class
class Animal1{
    void eat(){
        System.out.println("A animal is eating!!");
    }
}
//sub class
class Dog1 extends Animal1{
    void bark(){
        eat();
        System.out.println("A dog is barking!!");
    }
}
//sub sub class
class BabyDog extends Dog1{
    void weep(){
        bark();
        System.out.println("Baby dog is weeping!!");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Animal1 animal1 = new Animal1();
        Dog1 dog1 = new Dog1();
        BabyDog babyDog = new BabyDog();

        animal1.eat();
        dog1.bark();
        dog1.eat();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();
    }
}
