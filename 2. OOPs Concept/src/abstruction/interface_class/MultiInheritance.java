package abstruction.interface_class;

interface Printable{
    void print();
}

interface Showable{
    void print();
}

class MultiIn implements Printable, Showable{

    @Override
    public void print() {
        System.out.println("Tanver");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        MultiIn mObj = new MultiIn();
        mObj.print();
//        mObj.show();
    }
}
