package basic;

import jdk.swing.interop.SwingInterOpUtils;

public class JavaOperation {
    public static void main(String[] args) {
        //java unary operation
        int a=10,b=10;
        System.out.println(a++);//11
        System.out.println(++a);//12
        System.out.println(a--);//11
        System.out.println(--a);//10

        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11
        a=10;
        System.out.println(~a);

        //Java Arithmetic Operator Example
        a=10;
        b=20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);

        //Java Left Shift Operator Example
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*4^4=15*16=240

        //Java Right Shift Operator
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/3^3=20/9=2
        System.out.println(-20>>>2);

        System.out.println(false&&true);
        System.out.println(false&true);

        //Java Ternary Operator Example
        a=2;
        b=5;
        int min=(a<b)?a:b;
        System.out.println(min);
        int max=(a>b)?a:b;
        System.out.println(max);

        //Java Assignment Operator Example
        a=10;
        b=20;
        a+=4;
        b-=4;
        System.out.println(a);
        System.out.println(b);
        a*=2;
        System.out.println(a);
        b/=2;
        System.out.println(b);

        //
        short m=10,n=10;
        m= (short) (m+n);
        System.out.println(m);

    }
}
