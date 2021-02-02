package abstruction.abstract_class;

abstract class Bike1 {
    Bike1() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

class Honda1 extends Bike1 {

    @Override
    void run() {
        System.out.println("running safely..");
    }
}
public class AbstractBike {
    public static void main(String[] args) {
        Bike1 obj = new Honda1();
        obj.run();
        obj.changeGear();
    }
}
