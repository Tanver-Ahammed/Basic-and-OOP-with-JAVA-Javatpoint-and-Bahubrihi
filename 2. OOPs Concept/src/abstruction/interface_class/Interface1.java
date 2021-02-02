package abstruction.interface_class;

//interface is a pure abstract class with no concrete methods
interface Robot{
    //By Default interface method are implicitly public and abstract
    void walk();
    void talk(String keyword);

    //By Default interface variable public , static and final
    int arms=2;
    int legs=2;
}

class BuilderRobot implements Robot {

    @Override
    public void walk() {
        System.out.println("Builder Robot walking....");
    }

    @Override
    public void talk(String keyword) {
        System.out.println("I am saying this "+keyword);
    }

    public void showLegAndArms(){
        System.out.println("Legs: "+legs+" Arms: "+Robot.arms);
    }
}
class FightingRobot implements Robot {
    @Override
    public void walk() {
        System.out.println("Fighting Robot walking....");
    }

    @Override
    public void talk(String keyword) {
        System.out.println("I am saying this " + keyword);
    }
}

public class Interface1 {
    public static void main(String[] args) {
        BuilderRobot bob = new BuilderRobot();
        Robot fob = new FightingRobot();


        bob.walk();
        bob.talk("Hello");
        System.out.println(Robot.arms);
        bob.showLegAndArms();

        fob.walk();
        fob.talk("Hi");
        System.out.println(Robot.legs);

    }
}

