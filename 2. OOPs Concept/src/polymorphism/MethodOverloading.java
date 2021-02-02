package polymorphism;

public class MethodOverloading {
    private static void add(int a,int b){
        System.out.println(a+b);
    }
    private static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    private static void add(int a,double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add(100,20);
        add(100,20,30);
        add(10,11.5);
    }
}
