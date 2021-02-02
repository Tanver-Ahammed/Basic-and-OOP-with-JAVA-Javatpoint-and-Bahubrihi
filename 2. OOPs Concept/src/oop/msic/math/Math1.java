package oop.msic.math;

import java.util.Scanner;
import java.lang.Math;

public class Math1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a,b,sum=0,sub=0;
        a = scanner.nextLong();
        b = scanner.nextLong();

        sum=Math.addExact(a,b);
        System.out.println(sum);

        sub=Math.subtractExact(a,b);
        System.out.println(sub);
    }
}
