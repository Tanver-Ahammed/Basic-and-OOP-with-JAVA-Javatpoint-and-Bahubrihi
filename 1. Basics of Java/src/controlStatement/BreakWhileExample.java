package controlStatement;

public class BreakWhileExample {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            i++;
            System.out.println(i);
            if (i==5)
                break;
        }
    }
}
