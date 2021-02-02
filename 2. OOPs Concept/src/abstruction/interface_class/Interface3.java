package abstruction.interface_class;

import java.util.Random;

interface A{
    default void showA(){
        System.out.println("showing A...");
    }

    int getInt();
}

interface B{
    default void showB(){
        System.out.println("showing B...");
    }

    double getDouble();
}


class MultipleInheritance implements A, B{

    @Override
    public int getInt() {
        return new Random().nextInt(5)+1;
    }

    @Override
    public double getDouble() {
        return new Random().nextDouble();
    }
}
public class Interface3 {
    public static void main(String[] args) {
        MultipleInheritance multiObj = new MultipleInheritance();
        multiObj.showA();
        multiObj.showB();

        System.out.println(multiObj.getInt());
        System.out.println(multiObj.getDouble());
    }
}
