package basic;

public class Variable {
    int instanceVariable = 10;
    static int staticVariable = 100;
    private void method(){
        System.out.println("instance variable: "+instanceVariable);
        int localVariable = 1000;
        System.out.println("local variable: "+localVariable);
    }

    public static void main(String[] args) {
        System.out.println("static variable: "+staticVariable);
        new Variable().method();
    }
}
