package oop.msic.recursio;

import java.util.Scanner;

public class Factorial {
    private static long fact(int n){
        if (n==1)
            return 0;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(fact(n));
        }
    }
}
