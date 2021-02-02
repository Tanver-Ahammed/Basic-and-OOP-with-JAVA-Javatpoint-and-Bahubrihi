package abstruction.interface_class;

interface Showables{
    void show();
    interface Message{
        void msg();
    }
}

class TestClass implements Showables.Message{

    @Override
    public void msg() {
        System.out.println("This is nested interface!!");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        Showables.Message message = new TestClass();
        message.msg();

    }
}
