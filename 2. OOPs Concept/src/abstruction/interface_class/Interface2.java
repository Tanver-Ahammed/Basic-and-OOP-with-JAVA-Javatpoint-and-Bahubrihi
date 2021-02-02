package abstruction.interface_class;

import java.util.Random;

interface Test1{
    void foo();

    //default method in interface
    default int showNumber(){
        return new Random().nextInt(5)+1;
    }
}
interface Test2 extends Test1{
    void boo();

    //static method interface
    static double getRandDouble(){
        return new Random().nextDouble();
    }
}

class Test implements Test2{
    @Override
    public void foo() {
        System.out.println("foo foo");
    }

    @Override
    public void boo() {
        System.out.println("boo boo");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Test t = new Test();
        t.boo();
        t.foo();
        System.out.println(t.showNumber());
        System.out.println(Test2.getRandDouble());
    }
}
