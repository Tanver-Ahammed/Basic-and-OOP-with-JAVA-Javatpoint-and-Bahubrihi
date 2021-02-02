package controlStatement;

public class SwitchExample {
    public static void main(String[] args) {
        int a = 20;
        switch (a){
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
                break;
            case 30:
                System.out.println(30);
                break;
            default:
                System.out.println("Your value is not found");
        }
    }
}
