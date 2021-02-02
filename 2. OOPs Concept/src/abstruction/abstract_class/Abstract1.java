package abstruction.abstract_class;

abstract class Bike{
    abstract void run();
}

class Honda extends Bike{
    @Override
    void run() {
        System.out.println("running safely");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Bike bike = new Honda();
        bike.run();
    }
}
