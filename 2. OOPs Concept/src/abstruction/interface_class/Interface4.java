package abstruction.interface_class;

interface IF1{
    default void fanc(){
        System.out.println("calling function of IF1");
    }
}

interface IF2 extends IF1{
    default void fanc(){
        IF1.super.fanc();
        System.out.println("calling function of IF2");
    }
}

class T implements IF2{
    public void func(){
        IF2.super.fanc();
        System.out.println("calling function T");
    }
}

public class Interface4 {
    public static void main(String[] args) {
        T tObj = new T();
        tObj.func();

    }
}
