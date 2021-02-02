package polymorphism;

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle{
    @Override
    void run(){
        super.run();
        System.out.println("Bike is running");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle vehicleObj = new Vehicle();
        Bike bikeObj = new Bike();

        bikeObj.run();
    }
}
