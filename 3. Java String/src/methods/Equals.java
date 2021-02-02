package methods;

import java.util.ArrayList;

public class Equals {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "JAVA";
        String s3 = "java";
        String s4 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s3));

        ArrayList<String>list = new ArrayList<>();
        list.add("C");
        list.add("C++");
        list.add("JAVA");
        list.add("Python");
        list.add("Go");
        list.add("R");

        for (String st : list) {
            System.out.println(st);
        }

    }
}
