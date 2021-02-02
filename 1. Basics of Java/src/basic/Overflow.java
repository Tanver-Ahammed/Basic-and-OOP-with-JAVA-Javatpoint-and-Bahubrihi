package basic;

public class Overflow {
    public static void main(String[] args) {
        int a=120;
        int b =130;

        byte c = (byte)a;
        byte d = (byte)b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
