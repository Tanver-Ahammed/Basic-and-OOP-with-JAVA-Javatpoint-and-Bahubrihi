package polymorphism;

class Animal3{

}
class Dog3 extends Animal3{
    static void method(Animal3 a){
        if (a instanceof Dog3){
            Dog3 d = (Dog3)a;
            System.out.println("ok downcasting performed");
        }
    }
}
public class InstanceOfSimple {
    public static void main(String[] args) throws Exception{
        Dog3 d = (Dog3) new Animal3();
        Dog3.method(d);
    }
}
