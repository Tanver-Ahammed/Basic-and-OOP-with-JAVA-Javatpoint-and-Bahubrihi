package oop.msic.recursio;

import java.util.Scanner;

public class FibonacciSeries {
    int n1=0,n2=1,n3=0;
    private void printFibonacci(int count) {
        if (count>0){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            printFibonacci(count-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.print(0+" "+1+" ");
            new FibonacciSeries().printFibonacci(n-2);
            System.out.println();
        }
    }
}