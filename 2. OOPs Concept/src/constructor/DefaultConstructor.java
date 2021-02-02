package constructor;

public class DefaultConstructor {
    private DefaultConstructor(){
        System.out.println("This is default Constructor!!");
    }

    public static void main(String[] args) {
        DefaultConstructor dc = new DefaultConstructor();
    }
}
