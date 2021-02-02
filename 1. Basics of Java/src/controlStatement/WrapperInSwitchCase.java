package controlStatement;

public class WrapperInSwitchCase {
    public static void main(String[] args) {
        Integer mark = 35;
        switch (mark){
            case 32:
                System.out.println("You will Fail!!");
                break;
            case 35:
                System.out.println("You Will  pass in the Exam!!");
                break;
            default:
                System.out.println("INVALID!!");
        }
    }
}
