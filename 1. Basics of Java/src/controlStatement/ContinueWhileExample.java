package controlStatement;

public class ContinueWhileExample {
    public static void main(String[] args) {
        int i=0;
        while (i<10){
            i++;
            if (i==5)
                continue;
            System.out.println(i);
        }
    }
}
