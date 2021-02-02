package polymorphism;

public class PromotionTypeOverloading {
    private static void sum(int a,int b){
        System.out.println("Integer");
        System.out.println(a+b);
    }
    private static void sum(long a,long b){
        System.out.println("Long");
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        sum(10,10);
    }
}
