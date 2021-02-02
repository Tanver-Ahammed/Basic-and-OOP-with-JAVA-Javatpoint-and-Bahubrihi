package basic;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        findEvenOdd(num);
    }
    private static void findEvenOdd(int n){
        if (n%2==0)
            System.out.println(n+ " is EVEN");
        else
            System.out.println(n+" is odd");
    }
}
