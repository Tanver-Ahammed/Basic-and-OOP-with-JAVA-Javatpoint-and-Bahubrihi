package oop.msic.recursio;

public class RecursionExample1 {
    static int i=0;
    private static void printMethod(){
        if (i<=10) {
            System.out.println(i++);
            System.out.println("Hello world!!");
            printMethod();
            return;
        }
    }
    public static void main(String[] args) {
        printMethod();
    }
}
