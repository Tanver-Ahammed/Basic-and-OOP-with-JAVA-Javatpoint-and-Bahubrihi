package polymorphism;

public class InstanceInitializerBlock {
    int yourSpeed;

    public InstanceInitializerBlock() {
        System.out.println("Your speed is: "+yourSpeed);
    }

    {
        yourSpeed=100;
    }

    public static void main(String[] args) {
        InstanceInitializerBlock obj1 = new InstanceInitializerBlock();
        InstanceInitializerBlock obj2 = new InstanceInitializerBlock();
    }
}
