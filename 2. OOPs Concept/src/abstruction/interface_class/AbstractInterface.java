package abstruction.interface_class;

interface Aa{
    void a();
    void b();
    void c();
    void d();
}

abstract class Bb implements Aa {
    @Override
    public void c() {
        System.out.println("I am C");
    }
}
class M extends Bb {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }
}
public class AbstractInterface {
    public static void main(String[] args) {
        Aa a=new M();
        a.b();
        a.b();
        a.c();
        a.d();
    }
}
