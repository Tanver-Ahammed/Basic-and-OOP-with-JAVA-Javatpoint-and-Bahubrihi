package basic;

public class Calculation {
    void fact(int n){
        int fact =1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is : "+fact);
    }

    public static void main(String[] args) {
        new Calculation().fact(5);
        new Calculation().fact(10);
        new Calculation().fact(7);
    }
}
