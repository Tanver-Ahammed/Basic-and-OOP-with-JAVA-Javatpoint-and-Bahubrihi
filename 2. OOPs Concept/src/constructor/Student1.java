package constructor;

import java.util.Scanner;

//Example of Constructor Overloading
public class Student1 {
    int id;
    String name;
    float age;

    private Student1(int id, String name, float age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();
        float age = scanner.nextFloat();

        Student1 s1 = new Student1(id, name, age);
        Student1 s2 = new Student1(id, name);
        s1.display();
        s2.display();

    }
}
