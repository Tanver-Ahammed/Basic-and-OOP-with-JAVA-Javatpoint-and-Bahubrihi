package basic;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        StringTokenizer strT = new StringTokenizer("My name is Md. Tanver Ahahmmed.");
        while (strT.hasMoreElements())
            System.out.println(strT.nextToken());


    }
}
