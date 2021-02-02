package basic;

public class Employee {
    int id;
    String name;
    float salary;

    void insertData(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + Math.round(salary));
    }
}
